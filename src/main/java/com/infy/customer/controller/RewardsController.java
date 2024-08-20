/*
    Rewards controller has two customer centric APIs:
    1. "/customer" --> provide all the customer details.
    2. /customers/{customer_id} --> provides specific customer details.
 */

package com.infy.customer.controller;

import java.util.List;

import com.infy.customer.entity.CustomerEntity;
import com.infy.customer.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    // fetches all the customers and all their purchases and earned reward points
    @GetMapping("/customers")
    public List<CustomerEntity> findAllCustomer() {
        return rewardsService.getAllCustomers();
    }


    // fetches all the purchases and earned reward points of a single customer
    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerEntity> getCustomer(@PathVariable Integer id) {
        CustomerEntity customer = rewardsService.getCustomerById(id);

        if (customer == null) {
            return new ResponseEntity<CustomerEntity>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<CustomerEntity>(customer, HttpStatus.OK);
    }
}