package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_owners")
public class OwnerEntity {

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
    private List<VehicleEntity> cars;

    public OwnerEntity() {}

    public Long getId() {
        return id;
    }

    public OwnerEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public OwnerEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public OwnerEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public OwnerEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<VehicleEntity> getCars() {
        return cars;
    }

    public OwnerEntity setCars(List<VehicleEntity> cars) {
        this.cars = cars;
        return this;
    }
}
