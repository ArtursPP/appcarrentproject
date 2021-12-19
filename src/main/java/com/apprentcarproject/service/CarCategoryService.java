package com.apprentcarproject.service;


import com.apprentcarproject.repository.CarCategoryRepository;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CarCategoryService {

    private CarCategoryRepository carCategoryRepository;


}
