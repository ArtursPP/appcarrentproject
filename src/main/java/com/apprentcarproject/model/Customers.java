package com.apprentcarproject.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customers {

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(name = "CUSTOMER_NAME")

    private String customerName;

    @Column(name = "CUSTOMER_LAST_NAME")

    private String customerLastName;

    @Column(name = "CUSTOMER_PHONE_NUMBER")

    private String customerPhoneNumber;

    @Column(name = "CUSTOMER_EMAIL")

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
