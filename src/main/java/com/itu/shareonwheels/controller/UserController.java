package com.itu.shareonwheels.controller;

import com.itu.shareonwheels.dto.UserSignUpDto;
import com.itu.shareonwheels.entity.User;
import com.itu.shareonwheels.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ramya on 9/28/15.
 */
//Rest Controller EndPoint
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/v1/user", method = RequestMethod.POST)
    public @ResponseBody Long signUp(@RequestBody UserSignUpDto userSignUpDto,
                                     HttpServletRequest request,
                       HttpServletResponse response) {

        User user = new User();
        user.setFirstName(userSignUpDto.getFirstName());
        System.out.println(userSignUpDto.getFirstName());
        user.setLastName(userSignUpDto.getLastName());
        user.setUserName(userSignUpDto.getEmail());
        user.setEmailAddress(userSignUpDto.getEmail());
        user.setPhoneNumber(userSignUpDto.getPhone());

        return userService.create(user);

    }

    @RequestMapping(value = "/v1/user/{userId}", method = RequestMethod.PUT)
    public void getUserDetails(@PathVariable("userId") Long userId,
                                             @RequestBody User user,
                                             HttpServletRequest request,
                                             HttpServletResponse response) {

        userService.update(user);
    }
}