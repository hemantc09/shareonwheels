package com.itu.shareonwheels.controller;


import com.itu.shareonwheels.dto.TripRegistrationDto;
import com.itu.shareonwheels.entity.Trip;
import com.itu.shareonwheels.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nikitasonthalia on 10/9/15.
 */
public class TripController {

    @Autowired
    private TripService tripService;

    @RequestMapping(value = "/v1/trip", method = RequestMethod.POST)
    public
    @ResponseBody
    long TripRegistration(@RequestBody TripRegistrationDto tripRegistrationDto,
                          HttpServletRequest request,
                          HttpServletResponse response) {

        Trip trip = new Trip();

        trip.setStartlocation(tripRegistrationDto.getStartlocation());
        trip.setDestination(tripRegistrationDto.getDestination());
        trip.setTriptime(tripRegistrationDto.getTriptime());
        trip.setSeatavailable(tripRegistrationDto.getSeatavailable());
        trip.setUserid(tripRegistrationDto.getUserid());
        trip.setUsertype(tripRegistrationDto.getUsertype());
        trip.setTripdate(tripRegistrationDto.getTripdate());
        trip.setDayOfWeek(tripRegistrationDto.getDayOfWeek());
        trip.setFrequency(tripRegistrationDto.getFrequency());
        trip.setTripType(tripRegistrationDto.getTripType());


        return tripService.create(trip);


    }
}
