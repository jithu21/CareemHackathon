package com.careem.hack.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Vineet on 25/02/17.
 */
@Entity
@Table(name = "Contact")
public class Contact {

    private String name;
    private String contactNumber;
    private String email;



}
