package com.olivebank.accounts.mapper;

import com.olivebank.accounts.dto.CustomerDto;
import com.olivebank.accounts.entity.Customer;

public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }
    /**
     * Maps a CustomerDto object to a Customer entity.
     *
     * @param customerDto the CustomerDto object to map
     * @param customer    the Customer entity to map to
     * @return the mapped Customer entity
     */
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        // Set the customer name from the customer DTO
        customer.setName(customerDto.getName());
        // Set the customer email from the customer DTO
        customer.setEmail(customerDto.getEmail());
        // Set the customer mobile number from the customer DTO
        customer.setMobileNumber(customerDto.getMobileNumber());
        // Return the mapped Customer entity
        return customer;
    }

}
