package com.careem.hack.models;

import com.careem.constants.VehicleType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vineet on 25/02/17.
 */
public class Vehicle {
    private static final long serialVersionUID = 1L;
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


}
