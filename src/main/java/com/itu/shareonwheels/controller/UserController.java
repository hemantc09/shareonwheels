package com.itu.shareonwheels.controller;

import com.itu.shareonwheels.dto.UserSignUpDto;
import com.itu.shareonwheels.entity.User;
import com.itu.shareonwheels.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ramya on 9/28/15.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    public @ResponseBody Long signUp(@RequestBody UserSignUpDto userSignUpDto,
                       HttpServletRequest request,
                       HttpServletResponse response) {

        User user = new User();

        return userService.create(user);

    }
}
