package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_owners")
public class VehicleOwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,name = "first_name")
    private String firstName;

    @Column(nullable = false,name = "last_name")
    private  String lastName;

    @OneToMany(
            mappedBy = "owner",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<Vehicle> cars;
}
