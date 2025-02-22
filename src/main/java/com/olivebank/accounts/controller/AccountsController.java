package com.olivebank.accounts.controller;

import com.olivebank.accounts.dto.CustomerDto;
import com.olivebank.accounts.dto.ResponseDto;
import com.olivebank.accounts.service.IAccountService;
import com.olivebank.accounts.util.AccountsConstants;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api", produces = "application/json")
@AllArgsConstructor
public class AccountsController {

    private IAccountService iAccountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customer) {

        iAccountService.createAccount(customer);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
