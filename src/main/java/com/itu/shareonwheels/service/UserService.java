package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramya on 9/28/15.
 */
@Service
public class UserService implements GenericService<User, Long> {

    @Autowired
    private UserDao userDao;


    public Long create(User user) {
        return userDao.create(user);
    }


    public void update(User user) {
         userDao.update(user);
    }


    public User get(Long aLong) {
        return null;
    }


    public List<User> getAll() {
        return null;
    }
//remove by id

    public void removeById(Long aLong) {

    }

}
