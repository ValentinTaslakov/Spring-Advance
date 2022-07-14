package com.FixMyCar.model.entities;

import com.FixMyCar.model.enums.RepairType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "workshops")
public class VehicleWorkshopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String name;

    private String address;

    private List<RepairType> repairTypeList;


}
