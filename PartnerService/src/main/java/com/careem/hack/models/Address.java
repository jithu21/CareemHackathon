package com.careem.hack.models;

import javax.persistence.Embedded;

/**
 * Created by Vineet on 25/02/17.
 */
public class Address {
    private String houseNumber;
    private String areaName;
    private long zipCode;
    @Embedded
    private Contact contact;


}
