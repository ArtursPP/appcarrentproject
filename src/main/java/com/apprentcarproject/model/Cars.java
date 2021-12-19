package com.apprentcarproject.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARS")
public class Cars {


    @Id
    @Column(name = "CAR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column(name = "CAR_MAKE")
    private String carMake;

    @Column(name = "CAR_MODEL")
    private String carModel;

    @Enumerated(EnumType.STRING)
    private TypeTransmission transmission;

    @Column(name = "AC")
    private boolean ac;

    @Column(name = "CAR_SEATS")
    private int carSeats;

    @Column(name = "CAR_DOORS")
    private int carDoors;

    @Column(name = "CAR_PHOTO")
    private String carPhoto;


}
