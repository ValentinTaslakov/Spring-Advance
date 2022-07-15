package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "repair_offers")
public class RepairOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "request_id", referencedColumnName = "id")
    private RepairRequest request;

    @Column(name = "description",nullable = false,columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private BigDecimal offerPrice;

    public VehicleWorkshopEntity getFromWorkshop() {
        return fromWorkshop;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workshop_id",referencedColumnName = "id")
    private VehicleWorkshopEntity fromWorkshop;

    private boolean isAccepted;

    public RepairOffer() {}

    public RepairOffer setFromWorkshop(VehicleWorkshopEntity fromWorkshop) {
        this.fromWorkshop = fromWorkshop;
        return this;
    }

    public long getId() {
        return id;
    }

    public RepairOffer setId(long id) {
        this.id = id;
        return this;
    }

    public RepairRequest getRequest() {
        return request;
    }

    public RepairOffer setRequest(RepairRequest request) {
        this.request = request;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RepairOffer setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    public RepairOffer setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
        return this;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public RepairOffer setAccepted(boolean accepted) {
        isAccepted = accepted;
        return this;
    }
}
