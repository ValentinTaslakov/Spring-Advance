package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.FuelTypeEnum;
import com.FixMyCar.model.enums.TransmissionEnum;
import com.FixMyCar.model.enums.VehicleTypeEnum;

import javax.persistence.*;


@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private VehicleTypeEnum type;

    private String brand;

    private String model;

    private int yearOfManufacture;

    @Enumerated(EnumType.STRING)
    private FuelTypeEnum fuel;

    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;

    private String VIN;

    private String engineCode;

    private int mileage;

    @ManyToOne
    private VehicleOwnerEntity owner;




}
