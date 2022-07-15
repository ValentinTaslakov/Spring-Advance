package com.FixMyCar.models.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orderEntities")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "repair_id",referencedColumnName = "id")
    private RepairEntity repairEntity;

    private BigDecimal partsPrice;

    private BigDecimal workPrice;

    private BigDecimal totalPrice;

    public OrderEntity() {}

    public Long getId() {
        return id;
    }

    public OrderEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public RepairEntity getRepair() {
        return repairEntity;
    }

    public OrderEntity setRepair(RepairEntity repairEntity) {
        this.repairEntity = repairEntity;
        return this;
    }

    public BigDecimal getPartsPrice() {
        return partsPrice;
    }

    public OrderEntity setPartsPrice(BigDecimal partsPrice) {
        this.partsPrice = partsPrice;
        return this;
    }

    public BigDecimal getWorkPrice() {
        return workPrice;
    }

    public OrderEntity setWorkPrice(BigDecimal workPrice) {
        this.workPrice = workPrice;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public OrderEntity setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
