package com.FixMyCar.models.entities;

import com.FixMyCar.models.enums.RepairType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "workshops")
public class WorkshopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String address;

    @ElementCollection
    private List<RepairType> repairTypeList = new ArrayList<>();

    @OneToMany(mappedBy = "id",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderEntity> orderEntities;

    public WorkshopEntity() {}

    public Long getId() {
        return id;
    }

    public WorkshopEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public WorkshopEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public WorkshopEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public WorkshopEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<RepairType> getRepairTypeList() {
        return repairTypeList;
    }

    public WorkshopEntity setRepairTypeList(List<RepairType> repairTypeList) {
        this.repairTypeList = repairTypeList;
        return this;
    }

    public List<OrderEntity> getOrders() {
        return orderEntities;
    }

    public WorkshopEntity setOrders(List<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
        return this;
    }
}
