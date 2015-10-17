package com.itu.shareonwheels.dao;
import com.itu.shareonwheels.entity.Trip;

/**
 * Created by nikitasonthalia on 10/9/15.
 */
public interface TripDao {

    void insert(Trip trip);
    void update(Trip trip);
    void delete(Trip trip);
    long create(Trip trip);

}
