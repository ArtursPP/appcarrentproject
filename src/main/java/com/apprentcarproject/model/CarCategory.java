package com.apprentcarproject.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CAR_CATEGORY")
public class CarCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CAR_CATEGORY_ID")
    private Long carCategoryId;

    @Column(name="CAR_CATEGORY")
    private String carCategory;

    @Column(name="BASE_PRICE")
    private Double basePrice;

    @Column(name="BASE_PRICE_WITH_INSURANCE")
    private Double basePriceWithInsurance;

    @Column(name="BASE_PRICE_WITH_TOP_INSURANCE")
    private Double basePriceWithTopInsurance;

    @Column(name="PRICE_TIRE_AND_GLASS_PROTECTION")
    private Double priceTireAndGlassProtection;


}
