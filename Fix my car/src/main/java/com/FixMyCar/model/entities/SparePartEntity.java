package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "parts")
public class SparePartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    public SparePartEntity() {}

    public long getId() {
        return id;
    }

    public SparePartEntity setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SparePartEntity setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public SparePartEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
