package com.olivebank.accounts.service.impl;

import com.olivebank.accounts.dto.CustomerDto;
import com.olivebank.accounts.entity.Accounts;
import com.olivebank.accounts.entity.Customer;
import com.olivebank.accounts.exception.CustomerAlreadyExistException;
import com.olivebank.accounts.mapper.CustomerMapper;
import com.olivebank.accounts.repository.AccountsRepository;
import com.olivebank.accounts.repository.CustomerRepository;
import com.olivebank.accounts.service.IAccountService;
import com.olivebank.accounts.util.AccountsConstants;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class AccountServiceImpl implements IAccountService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Optional<Customer> customerAlreadyExists = customerRepository.findByMobileNumber(customer.getMobileNumber());
        if (customerAlreadyExists.isPresent()) {
            throw new CustomerAlreadyExistException("Customer already exists with this number "+customer.getMobileNumber());
        }
        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("System");
        Customer savedCustomer=customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("System");
        return newAccount;
    }
}
