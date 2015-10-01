package com.itu.shareonwheels.entity;

import java.util.List;

/**
 * Created by ramya on 9/30/15.
 */
public class Rider extends User {

    private Long riderId;

    public Long getRiderId() {
        return riderId;
    }

    public void setRiderId(Long riderId) {
        this.riderId = riderId;
    }
}
