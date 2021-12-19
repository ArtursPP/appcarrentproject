package com.apprentcarproject.controller;

import com.apprentcarproject.dto.CustomersDTO;
import com.apprentcarproject.mapper.CustomersMapper;
import com.apprentcarproject.model.Customers;
import com.apprentcarproject.service.CustomersService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping(value = "api/rest/Customers.svc")


public class CustomersController {

    private CustomersService customersService;
    private CustomersMapper customersMapper;

    @GetMapping(value = "/customers")
    public List<CustomersDTO> getAllCustomers() {
        List<Customers> customers = customersService.getAllCustomers();
        return customers.stream().map(t -> customersMapper.toDTO(t)).collect(Collectors.toList());
    }

    @GetMapping(value = "/customers({customerId})")
    public CustomersDTO getCustomerById(@PathVariable Long customerId) {
        Customers customer = customersService.getCustomersById(customerId);
        return customersMapper.toDTO(customer);
    }

    @GetMapping(value = "/customer({customerName})")
    public List<CustomersDTO> getCustomersByCustomerName(@PathVariable String customerName){
        List<Customers> customers = customersService.getCustomersByCustomerName(customerName);
        return customers.stream().map(t -> customersMapper.toDTO(t)).collect(Collectors.toList());
    }

    @GetMapping(value = "/customer({customerLastName})")
    public List<CustomersDTO> getCustomersByCustomerLastName(@PathVariable String customerLastName){
        List<Customers> customers = customersService.getCustomersByCustomerLastName(customerLastName);
        return customers.stream().map(t -> customersMapper.toDTO(t)).collect(Collectors.toList());
    }

    @PostMapping(value = "/customer")
    public CustomersDTO saveNewCustomers(@RequestBody @Valid CustomersDTO customersDTO) {
        Customers customer = customersMapper.fromDTO(customersDTO);
        Customers savedCustomer = customersService.saveNewCustomers(customer);
        return customersMapper.toDTO(savedCustomer);
    }

    @PutMapping(value="/customer")
    public void updateCustomer (@RequestBody @Valid CustomersDTO customersDTO){
        Customers customers = customersMapper.fromDTO(customersDTO);
        customersService.updateCustomers(customers);
    }
}

