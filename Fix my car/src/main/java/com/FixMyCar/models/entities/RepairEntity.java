package com.FixMyCar.models.entities;

import com.FixMyCar.models.enums.RepairType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "repairs")
public class RepairEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private VehicleEntity vehicleEntity;

    @Enumerated(EnumType.STRING)
    private RepairType type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SparePartEntity> partsForReplacement;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String repairDescription;

    @Column(name = "actual_mileage", nullable = false)
    private int actualMileage;

    @Column(nullable = false)
    private LocalDate repairStart;

    @Column(nullable = false)
    private BigDecimal price;

    public RepairEntity() {}

    public Long getId() {
        return id;
    }

    public RepairEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public VehicleEntity getVehicle() {
        return vehicleEntity;
    }

    public RepairEntity setVehicle(VehicleEntity vehicleEntity) {
        this.vehicleEntity = vehicleEntity;
        return this;
    }

    public RepairType getType() {
        return type;
    }

    public RepairEntity setType(RepairType type) {
        this.type = type;
        return this;
    }

    public List<SparePartEntity> getPartsForReplacement() {
        return partsForReplacement;
    }

    public RepairEntity setPartsForReplacement(List<SparePartEntity> partsForReplacement) {
        this.partsForReplacement = partsForReplacement;
        return this;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public RepairEntity setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
        return this;
    }

    public int getActualMileage() {
        return actualMileage;
    }

    public RepairEntity setActualMileage(int actualMileage) {
        this.actualMileage = actualMileage;
        return this;
    }

    public LocalDate getRepairStart() {
        return repairStart;
    }

    public RepairEntity setRepairStart(LocalDate repairStart) {
        this.repairStart = repairStart;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public RepairEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
