package com.itu.shareonwheels.controller;

import com.itu.shareonwheels.dto.LoginRequestDto;
import com.itu.shareonwheels.dto.VehicleRequestDto;
import com.itu.shareonwheels.entity.User;
import com.itu.shareonwheels.entity.Vehicle;
import com.itu.shareonwheels.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;

/**
 * Created by ramya on 12/19/15.
 */
@Controller
public class VehicalInfoController {
    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/v1/owner/{ownerId}/vehicle", method ={RequestMethod.GET})
    public @ResponseBody
    Vehicle vehicleDetails(@PathVariable("ownerId")Long ownerId,
                HttpServletRequest request,
                HttpServletResponse response) throws IOException {
       return vehicleService.getVehicleDetailsByUserId(ownerId);


    }
}
