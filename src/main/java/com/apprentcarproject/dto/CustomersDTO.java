package com.apprentcarproject.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomersDTO {


    @JsonProperty(value="customer_id")
    private Long customerId;

    @JsonProperty(value="customer_name")
    private String customerName;

    @JsonProperty(value="customer_last_name")
    private String customerLastName;

    @JsonProperty(value="customer_phone_number")
    private String customerPhoneNumber;

    @JsonProperty(value="customer_email")
    private String customerEmail;

    @JsonProperty(value="customer_address")
    private String customerAddress;

    @JsonProperty(value="customer_postal_code")
    private String customerPostalCode;

    @JsonProperty(value="customer_city")
    private String customerCity;

    @JsonProperty(value="customer_country")
    private String customerCountry;
}
