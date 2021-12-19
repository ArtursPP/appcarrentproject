package com.apprentcarproject.dto;


import com.apprentcarproject.model.TypeTransmission;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CarsDTO {

    @JsonProperty(value = "car_id")
    private Long carId;

    @JsonProperty(value = "car_make")
    private String carMake;

    @JsonProperty(value = "car_model")
    private String carModel;

    private TypeTransmission transmission;

    private boolean ac;

    @JsonProperty(value = "car_seats")
    private int carSeats;

    @JsonProperty(value = "car_doors")
    private int carDoors;

    @JsonProperty(value = "car_photo")
    private String carPhoto;

}
