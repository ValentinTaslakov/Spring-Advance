package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.RepairType;

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private OwnerEntity owner;

    @Column(name = "problem_location", nullable = false)
    private RepairType problemLocation;

    @Column(name = "problem_description",nullable = false,columnDefinition = "TEXT")
    private String problemDescription;

    public RequestEntity() {}

    public long getId() {
        return id;
    }

    public RequestEntity setId(long id) {
        this.id = id;
        return this;
    }

    public OwnerEntity getOwner() {
        return owner;
    }

    public RequestEntity setOwner(OwnerEntity owner) {
        this.owner = owner;
        return this;
    }

    public RepairType getProblemLocation() {
        return problemLocation;
    }

    public RequestEntity setProblemLocation(RepairType problemLocation) {
        this.problemLocation = problemLocation;
        return this;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public RequestEntity setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
        return this;
    }
}
