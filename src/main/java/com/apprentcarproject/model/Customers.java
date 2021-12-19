package com.apprentcarproject.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customers {

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(name = "CUSTOMER_NAME")
    @NotEmpty(message = "Please enter your name")
    private String customerName;

    @Column(name = "CUSTOMER_LAST_NAME")
    @NotEmpty(message = "Please enter your last name")
    private String customerLastName;

    @Column(name = "CUSTOMER_PHONE_NUMBER")
    @NotEmpty(message = "Please enter your phone number")
    private String customerPhoneNumber;

    @Column(name = "CUSTOMER_EMAIL")
    @NotEmpty(message = "Please enter your email")
    private String customerEmail;

    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;

    @Column(name = "CUSTOMER_POSTAL_CODE")
    private String customerPostalCode;

    @Column(name = "CUSTOMER_CITY")
    private String customerCity;

    @Column(name = "CUSTOMER_COUNTRY")
    private String customerCountry;

}
