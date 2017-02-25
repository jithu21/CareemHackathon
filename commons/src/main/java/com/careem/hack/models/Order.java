package com.careem.hack.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Vineet on 25/02/17.
 */
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private List<TrackingDetail> trackingDetailList;
    private Dimension dimension;
    private long weight;
    private Date createdDate;
    private Date lastUpdatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TrackingDetail> getTrackingDetailList() {
        return trackingDetailList;
    }

    public void setTrackingDetailList(List<TrackingDetail> trackingDetailList) {
        this.trackingDetailList = trackingDetailList;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
