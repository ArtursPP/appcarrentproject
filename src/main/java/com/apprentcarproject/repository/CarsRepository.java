package com.apprentcarproject.repository;

import com.apprentcarproject.model.Cars;
import com.apprentcarproject.model.TypeTransmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {

    List<Cars> findCarsByCarMakeIgnoreCase(String carMake);
    List<Cars> findCarsByTransmission(TypeTransmission transmission);
}
