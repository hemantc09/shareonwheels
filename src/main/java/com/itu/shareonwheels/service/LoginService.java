package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nikitasonthalia on 10/10/15.
 */
public class LoginService{
    @Autowired
    UserDao userDao;

    public void validateUser(String userName, String password)
    {
        userDao.verifyLogin(userName,password);
    }

}
