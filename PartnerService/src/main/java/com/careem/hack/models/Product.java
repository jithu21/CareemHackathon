package com.careem.hack.models;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Vineet on 25/02/17.
 */

public class Product {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private Dimension dimension;
    private long weight;
    @Embedded
    private Address deliveryAddress;
    private List<TrackingDetail> trackingDetails;


}
