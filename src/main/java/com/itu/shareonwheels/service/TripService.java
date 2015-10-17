package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.TripDao;
import com.itu.shareonwheels.entity.Trip;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nikitasonthalia on 10/9/15.
 */
public class TripService implements GenericService< Trip, Long>
{
    @Autowired
    private TripDao tripDao;

    public void insert(Trip trip)
    {
        tripDao.insert(trip);
    }

    public void update(Trip trip)
    {
        tripDao.update(trip);
    }


    public void removeById(Long aLong) {

    }

    public List<Trip> getAll() {
        return null;
    }

    public Trip get(Long aLong) {
        return null;
    }

    public Long create(Trip trip) {
        String trip_Type;
        trip_Type=trip.getTripType();

        if(trip_Type=="Routine" || trip_Type=="routine")
        {

            return tripDao.create(trip);
        }
        else
        {
            return tripDao.create(trip);
        }

    }

}

