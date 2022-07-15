package com.FixMyCar.model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "repair_offers")
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "request_id", referencedColumnName = "id")
    private RequestEntity request;

    @Column(name = "description",nullable = false,columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private BigDecimal offerPrice;

    public WorkshopEntity getFromWorkshop() {
        return fromWorkshop;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workshop_id",referencedColumnName = "id")
    private WorkshopEntity fromWorkshop;

    private boolean isAccepted;

    public OfferEntity() {}

    public OfferEntity setFromWorkshop(WorkshopEntity fromWorkshop) {
        this.fromWorkshop = fromWorkshop;
        return this;
    }

    public long getId() {
        return id;
    }

    public OfferEntity setId(long id) {
        this.id = id;
        return this;
    }

    public RequestEntity getRequest() {
        return request;
    }

    public OfferEntity setRequest(RequestEntity request) {
        this.request = request;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    public OfferEntity setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
        return this;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public OfferEntity setAccepted(boolean accepted) {
        isAccepted = accepted;
        return this;
    }
}
