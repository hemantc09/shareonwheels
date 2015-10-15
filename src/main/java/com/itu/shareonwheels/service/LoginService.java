package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nikitasonthalia on 10/10/15.
 */


@Service
public class LoginService{

    @Autowired
    private UserDao userDao;

    public void validateUser(String userName, String password)
    {
        userDao.verifyLogin(userName,password);
    }

}
