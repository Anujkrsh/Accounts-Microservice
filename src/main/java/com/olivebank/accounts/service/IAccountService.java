package com.olivebank.accounts.service;

import com.olivebank.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);
}
