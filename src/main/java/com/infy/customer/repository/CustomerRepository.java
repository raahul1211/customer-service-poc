/*
    CustomerRepository is a place-holder for customer records.
 */

package com.infy.customer.repository;

import com.infy.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
