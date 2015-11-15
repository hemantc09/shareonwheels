package com.itu.shareonwheels.controller;
import com.itu.shareonwheels.dto.TripRequestDto;
import com.itu.shareonwheels.entity.Trip;
import com.itu.shareonwheels.service.TripRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nikitasonthalia on 10/17/15.
 */
@Controller
public class TripRequestController {

    @Autowired
    private TripRequestService tripRequestService;

    @RequestMapping(value = "/v1/trip/request/{userId}", method = RequestMethod.PUT)
    public @ResponseBody
    Long tripRequest(@RequestBody TripRequestDto tripRequestDto, @PathVariable("userId") Long userId,
                                                                        HttpServletRequest request,
                                                                         HttpServletResponse response){

        Trip trip = new Trip();


        trip.setTripId(tripRequestDto.getTripId());
        trip.setSeatAvailable(tripRequestDto.getSeatavailable());
        trip.setUserId(tripRequestDto.getUserid());
        trip.setUserType(tripRequestDto.getUsertype());
        trip.setTripType(tripRequestDto.getTripType());

       return tripRequestService.tripRequest(trip);



    }

}
