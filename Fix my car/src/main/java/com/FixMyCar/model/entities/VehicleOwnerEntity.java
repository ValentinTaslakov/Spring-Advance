package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_owners")
public class VehicleOwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public VehicleOwnerEntity() {}

    public Long getId() {
        return id;
    }

    public VehicleOwnerEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public VehicleOwnerEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public VehicleOwnerEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public VehicleOwnerEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<Vehicle> getCars() {
        return cars;
    }

    public VehicleOwnerEntity setCars(List<Vehicle> cars) {
        this.cars = cars;
        return this;
    }
}
