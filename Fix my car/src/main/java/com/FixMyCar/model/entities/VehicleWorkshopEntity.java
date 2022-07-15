package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.RepairType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "workshops")
public class VehicleWorkshopEntity {

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
    private List<Order> orders;

    public VehicleWorkshopEntity() {}

    public Long getId() {
        return id;
    }

    public VehicleWorkshopEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public VehicleWorkshopEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public VehicleWorkshopEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public VehicleWorkshopEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<RepairType> getRepairTypeList() {
        return repairTypeList;
    }

    public VehicleWorkshopEntity setRepairTypeList(List<RepairType> repairTypeList) {
        this.repairTypeList = repairTypeList;
        return this;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public VehicleWorkshopEntity setOrders(List<Order> orders) {
        this.orders = orders;
        return this;
    }
}
