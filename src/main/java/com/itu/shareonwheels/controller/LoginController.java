package com.itu.shareonwheels.controller;

import com.itu.shareonwheels.dto.LoginRequestDto;
import com.itu.shareonwheels.entity.User;
import com.itu.shareonwheels.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ramya on 10/10/15.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/v1/user", method = RequestMethod.POST)
    public @ResponseBody
    void signUp(@RequestBody LoginRequestDto loginRequestDto,
                HttpServletRequest request,
                HttpServletResponse response) {

        User validateUser = new User();
        String userName = loginRequestDto.getEmailAddress();

        String password = loginRequestDto.getPassword();

         loginService.validateUser(userName, password);

    }
}
