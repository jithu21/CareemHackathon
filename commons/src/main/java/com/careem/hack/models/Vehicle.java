package com.careem.hack.models;


import com.careem.hack.constants.VehicleType;

import javax.persistence.*;

/**
 * Created by Vineet on 25/02/17.
 */
@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private VehicleType vehicleType;
    private long averageSpeed;
    private double load;
    private boolean reliable;
    private double costPerKM;
    private Dimension dimension;
    private Contact driver;
    private boolean intercity;

    @ManyToOne
    @JoinColumn(name = "hub_id")
    private Hub hub;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public long getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(long averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public boolean isReliable() {
        return reliable;
    }

    public void setReliable(boolean reliable) {
        this.reliable = reliable;
    }

    public double getCostPerKM() {
        return costPerKM;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Contact getDriver() {
        return driver;
    }

    public void setDriver(Contact driver) {
        this.driver = driver;
    }

    public boolean isIntercity() {
        return intercity;
    }

    public void setIntercity(boolean intercity) {
        this.intercity = intercity;
    }
}
