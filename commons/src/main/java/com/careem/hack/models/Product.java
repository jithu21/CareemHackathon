package com.careem.hack.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Vineet on 25/02/17.
 */

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private Dimension dimension;
    private long weight;
    @Embedded
    private Address deliveryAddress;
    private List<TrackingDetail> trackingDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<TrackingDetail> getTrackingDetails() {
        return trackingDetails;
    }

    public void setTrackingDetails(List<TrackingDetail> trackingDetails) {
        this.trackingDetails = trackingDetails;
    }
}
