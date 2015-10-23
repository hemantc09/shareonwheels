package com.itu.shareonwheels.dao;

import com.itu.shareonwheels.entity.Trip;

/**
 * Created by nikitasonthalia on 10/17/15.
 */
public interface TripRequestDao {

    Long checkSeat(Trip trip);
}
