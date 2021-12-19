package com.apprentcarproject.service;

import com.apprentcarproject.model.Customers;
import com.apprentcarproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CustomersService {

    private CustomerRepository customerRepository;

    private ExampleMatcher matcher;

    @PostConstruct
    private void init() {
        matcher = ExampleMatcher.matchingAll()
                .withIgnoreNullValues()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase();
    }

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

    public Customers saveNewCustomers(Customers customer) {
        return customerRepository.save(customer);
    }

    public List<Customers> getCustomersByCustomerName(String customerName) {
        return customerRepository.findAllByCustomerNameIgnoreCase(customerName);
    }

    public List<Customers> getCustomersByCustomerLastName(String customerLastName) {
        return  customerRepository.findAllByCustomerLastNameIgnoreCase(customerLastName);
    }

    public void updateCustomers(Customers customers) {
        customerRepository.save(customers);
    }
}
