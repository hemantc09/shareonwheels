package com.itu.shareonwheels.controller;

import com.itu.shareonwheels.dto.DriverDto;
import com.itu.shareonwheels.entity.Driver;
import com.itu.shareonwheels.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ramya on 10/14/15.
 */
@Controller
public class DriverController {
//    @Autowired
//    DriverService driverService;
//
//    @RequestMapping(value = "v1/driver",method = RequestMethod.POST)
//    public @ResponseBody
//    void driverDeails(@RequestBody DriverDto driverDto,
//                      HttpServletRequest httpServletRequest,
//                      HttpServletResponse httpServletResponse)
//    {
//
//        Driver driver = new Driver();
//        driver.setDriverLicenseNumber(driverDto.getDriverLicenseNumber());
//        driverService.create(driver);
//    }



}
