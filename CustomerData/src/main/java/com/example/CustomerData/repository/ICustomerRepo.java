package com.example.CustomerData.repository;

import com.example.CustomerData.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer,Integer> {
    Customer findFirstByCustomerId(int customerId);
}
