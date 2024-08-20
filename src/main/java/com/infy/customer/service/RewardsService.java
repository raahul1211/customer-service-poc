/*
    RewardsService class provides two method definitions for default methods provided by JPA repository
    as 'findAll' and 'findById'
 */

package com.infy.customer.service;

import com.infy.customer.entity.CustomerEntity;
import com.infy.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardsService {

    @Autowired
    private CustomerRepository customerRepository;

    // using JPA functionality to fetch the data for all the customers from DB.
    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    // using JPA functionality to fetch the data for a specific customers from DB.
    public CustomerEntity getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }
}
