package com.apprentcarproject.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OFFICE")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OFFICE_ID")
    private Long office_id;

    @Column(name="OFFICE_CODE")
    private String officeCode;

    @Column(name = "OFFICE_NAME")
    private String officeName;

    @Column(name="OFFICE_ADDRESS")
    private String officeAddress;

    @Column(name="OFFICE_POST_CODE")
    private String officePostCode;

    @Column(name="OFFICE_CITY")
    private String officeCity;

    @Column(name="OFFICE_COUNTRY")
    private String officeCountry;
}
