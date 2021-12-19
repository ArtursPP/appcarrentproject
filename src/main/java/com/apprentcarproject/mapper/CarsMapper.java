package com.apprentcarproject.mapper;


import com.apprentcarproject.dto.CarsDTO;
import com.apprentcarproject.model.Cars;
import org.springframework.stereotype.Component;

@Component
public class CarsMapper {

    public Cars fromDTO( CarsDTO carsDTO){
        Cars cars = new Cars();
        cars.setCarId(carsDTO.getCarId());
        cars.setCarMake(carsDTO.getCarMake());
        cars.setCarModel(carsDTO.getCarModel());
        cars.setTransmission(carsDTO.getTransmission());
        cars.setAc(carsDTO.isAc());
        cars.setCarSeats(carsDTO.getCarSeats());
        cars.setCarDoors(carsDTO.getCarDoors());
        cars.setCarPhoto(carsDTO.getCarPhoto());
        return cars;
    }

    public CarsDTO toDTO(Cars cars){
        CarsDTO carsDTOs= new CarsDTO();
        carsDTOs.setCarId(cars.getCarId());
        carsDTOs.setCarMake(cars.getCarMake());
        carsDTOs.setCarModel(cars.getCarModel());
        carsDTOs.setTransmission(cars.getTransmission());
        carsDTOs.setAc(cars.isAc());
        carsDTOs.setCarSeats(cars.getCarSeats());
        carsDTOs.setCarDoors(cars.getCarDoors());
        carsDTOs.setCarPhoto(cars.getCarPhoto());
        return carsDTOs;
    }



}
