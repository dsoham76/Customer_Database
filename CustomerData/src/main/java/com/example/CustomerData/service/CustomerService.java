package com.example.CustomerData.service;

import com.example.CustomerData.model.Customer;
import com.example.CustomerData.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    ICustomerRepo customerRepo;

    public List<Customer> getCustomer(int pageNumber,int pageSize) {

        Pageable pageable= PageRequest.of(pageNumber,pageSize);
        Page<Customer> customerPage=customerRepo.findAll(pageable);
        List<Customer> content=customerPage.getContent();
        return content;
    }

    public Customer getCustomerById(int customerId) {
        return customerRepo.findFirstByCustomerId(customerId);
    }

    public String deleteCustomerById(int customerId) {
        if(customerRepo.existsById(customerId)){
            customerRepo.deleteById(customerId);
            return "Customer has been deleted";
        }else{
            return "No suitable customer found for id";
        }
    }

    public String createCustomer(Customer customer) {
        customerRepo.save(customer);
        return "Customer has been created.";
    }

    public String updateCustomer(int customerId, Customer customer) {
        if(customerRepo.existsById(customerId)){
            customerRepo.save(customer);
            return "Customer details are updated";
        }else{
            return "No suitable customer found for id";
        }
    }


}
