package com.careem.hack.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * Created by Vineet on 25/02/17.
 */
@Embeddable
public class Address {
    private String houseNumber;
    private String areaName;
    private long zipCode;
    @Embedded
    private Contact contact;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
