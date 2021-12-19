package com.apprentcarproject.mapper;


import com.apprentcarproject.dto.CustomersDTO;
import com.apprentcarproject.model.Customers;
import org.springframework.stereotype.Component;

@Component
public class CustomersMapper {


    public Customers fromDTO (CustomersDTO customersDTO){
        Customers customers = new Customers();
        customers.setCustomerId(customersDTO.getCustomerId());
        customers.setCustomerName(customersDTO.getCustomerName());
        customers.setCustomerLastName(customersDTO.getCustomerLastName());
        customers.setCustomerPhoneNumber(customersDTO.getCustomerPhoneNumber());
        customers.setCustomerEmail(customersDTO.getCustomerEmail());
        customers.setCustomerAddress(customersDTO.getCustomerAddress());
        customers.setCustomerPostalCode(customersDTO.getCustomerPostalCode());
        customers.setCustomerCity(customersDTO.getCustomerCity());
        customers.setCustomerCountry(customersDTO.getCustomerCountry());
        return customers;
    }

    public CustomersDTO toDTO (Customers customers){
        CustomersDTO customersDTO = new CustomersDTO();
        customersDTO.setCustomerId(customers.getCustomerId());
        customersDTO.setCustomerName(customers.getCustomerName());
        customersDTO.setCustomerLastName(customers.getCustomerLastName());
        customersDTO.setCustomerPhoneNumber(customers.getCustomerPhoneNumber());
        customersDTO.setCustomerEmail(customers.getCustomerEmail());
        customersDTO.setCustomerAddress(customers.getCustomerAddress());
        customersDTO.setCustomerPostalCode(customers.getCustomerPostalCode());
        customersDTO.setCustomerCity(customers.getCustomerCity());
        customersDTO.setCustomerCountry(customers.getCustomerCountry());
        return customersDTO;
    }
}
