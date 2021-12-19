package com.apprentcarproject.controller;


import com.apprentcarproject.dto.CarsDTO;
import com.apprentcarproject.mapper.CarsMapper;
import com.apprentcarproject.model.Cars;
import com.apprentcarproject.model.TypeTransmission;
import com.apprentcarproject.service.CarsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="api/rest/Cars.svc")
@AllArgsConstructor
@CrossOrigin
public class CarsController {

 private CarsService carsService;
 private CarsMapper carsMapper;

 @GetMapping(value="/cars")
    public List<CarsDTO> getAllCars(){
     List<Cars> cars = carsService.getAllCars();
     return cars.stream().map(t-> carsMapper.toDTO(t)).collect(Collectors.toList());
 }

 @GetMapping(value = "/cars/make{carMake}")
 public List<CarsDTO> getCarsByCarMake(@PathVariable String carMake) {
  List<Cars> cars = carsService.getCarsByMake(carMake);
  return cars.stream().map(t -> carsMapper.toDTO(t)).collect(Collectors.toList());
 }

 @GetMapping(value="/cars/transmission/{transmission}")
 public List<CarsDTO> getCarsByTransmission(@PathVariable TypeTransmission transmission){
  List<Cars> cars = carsService.getCarsByTransmission(transmission);
  return cars.stream().map(t -> carsMapper.toDTO(t)).collect(Collectors.toList());
 }

}
