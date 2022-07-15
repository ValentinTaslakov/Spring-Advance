package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.FuelTypeEnum;
import com.FixMyCar.model.enums.TransmissionEnum;
import com.FixMyCar.model.enums.VehicleTypeEnum;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleTypeEnum type;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private int yearOfManufacture;

    @Enumerated(EnumType.STRING)
    private FuelTypeEnum fuel;

    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;

    @Column(nullable = false)
    private String VIN;

    @Column(nullable = false, name = "engine_code")
    private String engineCode;

    @Column(nullable = false)
    private int mileage;

    @ManyToOne
    private VehicleOwnerEntity owner;

    @OneToMany(mappedBy = "vehicle",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Repair> repairs;

    public Vehicle() {}

    public Long getId() {
        return id;
    }

    public Vehicle setId(Long id) {
        this.id = id;
        return this;
    }

    public VehicleTypeEnum getType() {
        return type;
    }

    public Vehicle setType(VehicleTypeEnum type) {
        this.type = type;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Vehicle setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }

    public FuelTypeEnum getFuel() {
        return fuel;
    }

    public Vehicle setFuel(FuelTypeEnum fuel) {
        this.fuel = fuel;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public Vehicle setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getVIN() {
        return VIN;
    }

    public Vehicle setVIN(String VIN) {
        this.VIN = VIN;
        return this;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public Vehicle setEngineCode(String engineCode) {
        this.engineCode = engineCode;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public Vehicle setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public VehicleOwnerEntity getOwner() {
        return owner;
    }

    public Vehicle setOwner(VehicleOwnerEntity owner) {
        this.owner = owner;
        return this;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public Vehicle setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
        return this;
    }
}
