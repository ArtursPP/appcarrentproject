package com.apprentcarproject.mapper;


import com.apprentcarproject.dto.CarCategoryDTO;
import com.apprentcarproject.model.CarCategory;
import org.springframework.stereotype.Component;

@Component
public class CarCategoryMapper {


    public CarCategory fromDTO(CarCategoryDTO carCategoryDTO){
        CarCategory carCategory = new CarCategory();
        carCategory.setCarCategoryId(carCategoryDTO.getCarCategoryId());
        carCategory.setCarCategory(carCategoryDTO.getCarCategory());
        carCategory.setBasePrice(carCategoryDTO.getBasePrice());
        carCategory.setBasePriceWithInsurance(carCategoryDTO.getBasePriceWithInsurance());
        carCategory.setBasePriceWithTopInsurance(carCategoryDTO.getBasePriceWithTopInsurance());
        carCategory.setPriceTireAndGlassProtection(carCategoryDTO.getPriceTireAndGlassProtection());
        return carCategory;

    }

    public CarCategoryDTO toDTO(CarCategory carCategory){
        CarCategoryDTO carCategoryDTOs = new CarCategoryDTO();
        carCategoryDTOs.setCarCategoryId(carCategory.getCarCategoryId());
        carCategoryDTOs.setCarCategory(carCategory.getCarCategory());
        carCategoryDTOs.setBasePrice(carCategory.getBasePrice());
        carCategoryDTOs.setBasePriceWithInsurance(carCategory.getBasePriceWithInsurance());
        carCategoryDTOs.setBasePriceWithTopInsurance(carCategory.getBasePriceWithTopInsurance());
        carCategoryDTOs.setPriceTireAndGlassProtection(carCategory.getPriceTireAndGlassProtection());
        return carCategoryDTOs;

    }




}
