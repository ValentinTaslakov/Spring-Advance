package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "repair_id",referencedColumnName = "id")
    private Repair repair;

    private BigDecimal partsPrice;

    private BigDecimal workPrice;

    private BigDecimal totalPrice;

    public Order() {}

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public Repair getRepair() {
        return repair;
    }

    public Order setRepair(Repair repair) {
        this.repair = repair;
        return this;
    }

    public BigDecimal getPartsPrice() {
        return partsPrice;
    }

    public Order setPartsPrice(BigDecimal partsPrice) {
        this.partsPrice = partsPrice;
        return this;
    }

    public BigDecimal getWorkPrice() {
        return workPrice;
    }

    public Order setWorkPrice(BigDecimal workPrice) {
        this.workPrice = workPrice;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Order setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
