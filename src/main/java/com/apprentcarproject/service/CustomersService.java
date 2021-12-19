package com.apprentcarproject.service;

import com.apprentcarproject.model.Customers;
import com.apprentcarproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomersService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomersService (CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customers> getAllCustomers(){
        return customerRepository.findAll();
    }


    public Customers getCustomersById(Long customerId) {
        return customerRepository.getById(customerId);
    }

    public Customers saveNewCustomer(Customers customer) {
        return customerRepository.save(customer);
    }
}
