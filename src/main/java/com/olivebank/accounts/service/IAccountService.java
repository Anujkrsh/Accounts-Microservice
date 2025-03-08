package com.olivebank.accounts.service;

import com.olivebank.accounts.dto.CustomerDto;
import com.olivebank.accounts.entity.Customer;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
