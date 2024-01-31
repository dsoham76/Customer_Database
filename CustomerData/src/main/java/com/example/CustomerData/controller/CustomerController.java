package com.example.CustomerData.controller;


import com.example.CustomerData.model.Customer;
import com.example.CustomerData.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //Get List of all customers
    @GetMapping("/customers")
    public List<Customer> getCustomers(@RequestParam(value = "pageNumber",defaultValue = "0",required = false) int pageNumber,@RequestParam(value = "pageSize",defaultValue = "5",required = false) int pageSize) {
        return customerService.getCustomer(pageNumber, pageSize);
    }

    //Get Customer by ID
    @GetMapping("/customer/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        return customerService.getCustomerById(customerId);
    }

    //Delete Customer by ID
    @DeleteMapping("/customer/{customerId}")
    public String deleteCustomerById(@PathVariable int customerId){
        return customerService.deleteCustomerById(customerId);
    }

    //Create a new Customer
    @PostMapping("/customer")
    public String createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    //To update an existing Customer
    @PutMapping("/customer/{customerId}")
    public String updateCustomer(@PathVariable int customerId,@RequestBody Customer customer){
        return customerService.updateCustomer(customerId,customer);
    }





}
