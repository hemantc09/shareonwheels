package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ramya on 9/28/15.
 */
public class UserService implements GenericService<User, Long> {

    @Autowired
    private UserDao userDao;

    @Override
    public Long create(User user) {
        return userDao.create(user);
    }

    @Override
    public void update(User user) {
         userDao.update(user);
    }

    @Override
    public User get(Long aLong) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
//remove by id
    @Override
    public void removeById(Long aLong) {

    }

}
