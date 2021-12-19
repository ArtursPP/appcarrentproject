package com.apprentcarproject.controller;

import com.apprentcarproject.dto.CustomersDTO;
import com.apprentcarproject.mapper.CustomersMapper;
import com.apprentcarproject.model.Customers;
import com.apprentcarproject.service.CustomersService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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

    @PostMapping(value = "/customer")
    public CustomersDTO saveNewCustomer(@RequestBody @Valid CustomersDTO customersDTO) {
        Customers customer = customersMapper.fromDTO(customersDTO);
        Customers savedCustomer = customersService.saveNewCustomer(customer);
        return customersMapper.toDTO(savedCustomer);
    }
}

