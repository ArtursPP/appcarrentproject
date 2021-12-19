package com.apprentcarproject.service;


import com.apprentcarproject.model.Cars;
import com.apprentcarproject.model.TypeTransmission;
import com.apprentcarproject.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CarsService {

    private CarsRepository carsRepository;

    private ExampleMatcher carsMatcher;

    @PostConstruct
    private void init(){
        carsMatcher = ExampleMatcher.matchingAll()
                .withIgnoreNullValues()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase();
    }


    @Autowired
    public CarsService ( CarsRepository carsRepository){
        this.carsRepository = carsRepository;
    }

    public List<Cars> getAllCars() {
        return carsRepository.findAll();
    }

    public List<Cars> getCarsByMake(String carMake) {
        return carsRepository.findCarsByCarMakeIgnoreCase(carMake);
    }

    public List<Cars>getCarsByTransmission(TypeTransmission transmission){
        return carsRepository.findCarsByTransmission(transmission);
    }
}
