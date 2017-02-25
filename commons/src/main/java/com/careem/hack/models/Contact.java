package com.careem.hack.models;

import javax.persistence.Embeddable;

/**
 * Created by Vineet on 25/02/17.
 */
@Embeddable
public class Contact {
    private String name;
    private String contactNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
