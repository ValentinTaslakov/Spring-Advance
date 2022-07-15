package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.RepairType;

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class RepairRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private VehicleOwnerEntity owner;

    @Column(name = "problem_location", nullable = false)
    private RepairType problemLocation;

    @Column(name = "problem_description",nullable = false,columnDefinition = "TEXT")
    private String problemDescription;

    public RepairRequest() {}

    public long getId() {
        return id;
    }

    public RepairRequest setId(long id) {
        this.id = id;
        return this;
    }

    public VehicleOwnerEntity getOwner() {
        return owner;
    }

    public RepairRequest setOwner(VehicleOwnerEntity owner) {
        this.owner = owner;
        return this;
    }

    public RepairType getProblemLocation() {
        return problemLocation;
    }

    public RepairRequest setProblemLocation(RepairType problemLocation) {
        this.problemLocation = problemLocation;
        return this;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public RepairRequest setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
        return this;
    }
}
