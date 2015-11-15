package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.TripRequestDao;
import com.itu.shareonwheels.entity.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nikitasonthalia on 10/17/15.
 */

@Service
public class TripRequestService {

    @Autowired
    private TripRequestDao tripRequestDao;

   public Long tripRequest(Trip trip) {

       // the EmailID from user table using trip


       //send the mail to Both the user
       return  tripRequestDao.checkSeat(trip);


   }



}
