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
    Long hubId;
    private long lattitude;
    private long longitude;
    private long radius;
    @Embedded
    private Contact contactPerson;

    private List<Vehicle> vehicleList;

    @Embedded
    private Dimension dimension;


}
