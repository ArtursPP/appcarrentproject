package com.apprentcarproject.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;



@Data
public class OfficeDTO {

    @JsonProperty(value = "office_id")
    private Long office_id;

    @JsonProperty(value = "office_code")
    private String officeCode;

    @JsonProperty(value = "office_name")
    private String officeName;

    @JsonProperty(value = "office_address")
    private String officeAddress;

    @JsonProperty(value = "office_post_code")
    private String officePostCode;

    @JsonProperty(value = "office_city")
    private String officeCity;

    @JsonProperty(value = "office_country")
    private String officeCountry;







}
