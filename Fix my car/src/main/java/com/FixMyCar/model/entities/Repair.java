package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.RepairType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "repairs")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vehicle vehicle;

    @Enumerated(EnumType.STRING)
    private RepairType type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SparePart> partsForReplacement;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String repairDescription;

    @Column(name = "actual_mileage", nullable = false)
    private int actualMileage;

    @Column(nullable = false)
    private LocalDate repairStart;

    @Column(nullable = false)
    private BigDecimal price;

    public Repair() {}

    public Long getId() {
        return id;
    }

    public Repair setId(Long id) {
        this.id = id;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Repair setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public RepairType getType() {
        return type;
    }

    public Repair setType(RepairType type) {
        this.type = type;
        return this;
    }

    public List<SparePart> getPartsForReplacement() {
        return partsForReplacement;
    }

    public Repair setPartsForReplacement(List<SparePart> partsForReplacement) {
        this.partsForReplacement = partsForReplacement;
        return this;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public Repair setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
        return this;
    }

    public int getActualMileage() {
        return actualMileage;
    }

    public Repair setActualMileage(int actualMileage) {
        this.actualMileage = actualMileage;
        return this;
    }

    public LocalDate getRepairStart() {
        return repairStart;
    }

    public Repair setRepairStart(LocalDate repairStart) {
        this.repairStart = repairStart;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Repair setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
