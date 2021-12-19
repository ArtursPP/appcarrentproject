package com.apprentcarproject.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;



@Data
public class CarCategoryDTO {


    @JsonProperty(value = "car_category_id")
    private Long carCategoryId;

    @JsonProperty( value="car_category")
    private String carCategory;

    @JsonProperty(value= "base_price")
    private Double basePrice;

    @JsonProperty(value= "base_price_with_insurance")
    private Double basePriceWithInsurance;

    @JsonProperty(value= "base_price_with_top_insurance")
    private Double basePriceWithTopInsurance;

    @JsonProperty(value="price_tire_and_glass-Protection")
    private Double priceTireAndGlassProtection;
}
