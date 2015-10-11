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
    public void upateUser(@PathVariable("userId") Long userId,
                                             @RequestBody User user,
                                             HttpServletRequest request,
                                             HttpServletResponse response) {

        user.setUserId(userId);
        userService.update(user);
    }

    @RequestMapping(value = "/v1/user/{userId}", method = RequestMethod.DELETE)
    public void deleteUSer(@PathVariable("userId") Long userId,
                                  HttpServletRequest request,
                                  HttpServletResponse response) {
        userService.removeById(userId);
    }

    @RequestMapping(value = "/v1/user/{userId}", method = RequestMethod.GET)
    public void getUser(@PathVariable("userId") Long userId,
                                  HttpServletRequest request,
                                  HttpServletResponse response) {
        userService.get(userId);
    }


    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    public void getAllUsers(HttpServletRequest request,
                            HttpServletResponse response) {
        userService.getAll();
    }

}