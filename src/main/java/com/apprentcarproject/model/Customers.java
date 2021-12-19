package com.apprentcarproject.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
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
    @Email
    private String customerEmail;

    @Column(name = "CUSTOMER_ADDRESS")
    @NotEmpty(message = "Please enter your address")
    private String customerAddress;

    @Column(name = "CUSTOMER_POSTAL_CODE")
    @NotEmpty(message = "Please enter your postal code")
    private String customerPostalCode;

    @Column(name = "CUSTOMER_CITY")
    @NotEmpty(message = "Please enter your City")
    private String customerCity;

    @Column(name = "CUSTOMER_COUNTRY")
    @NotEmpty(message = "Please enter your Country")
    private String customerCountry;

}
