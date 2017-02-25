package com.careem.hack.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Vineet on 25/02/17.
 */
@Entity
@Table(name = "hubs")
public class Hub {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hubId;
    private long lattitude;
    private long longitude;
    private long radius;
    @Embedded
    private Contact contactPerson;
    @OneToMany(mappedBy = "hub", cascade = CascadeType.REMOVE)
    private List<Vehicle> vehicleList;

    @Embedded
    private Dimension dimension;

    public Long getHubId() {
        return hubId;
    }

    public void setHubId(Long hubId) {
        this.hubId = hubId;
    }

    public long getLattitude() {
        return lattitude;
    }

    public void setLattitude(long lattitude) {
        this.lattitude = lattitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public Contact getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Contact contactPerson) {
        this.contactPerson = contactPerson;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
