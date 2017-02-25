package com.careem.hack.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vineet on 25/02/17.
 */
@Entity
@Table(name = "tracking_details")
public class TrackingDetail {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long hubId;

    private Hub hub;

    private Date startTime;
    private Date endTime;

    public Long getHubId() {
        return hubId;
    }

    public void setHubId(Long hubId) {
        this.hubId = hubId;
    }

    public Hub getHub() {
        return hub;
    }

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
