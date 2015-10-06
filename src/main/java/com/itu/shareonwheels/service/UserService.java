package com.itu.shareonwheels.service;

import com.itu.shareonwheels.entity.User;

import java.util.List;

/**
 * Created by ramya on 9/28/15.
 */
public class UserService implements GenericService<User, Long> {


    @Override

    public Long create(User user) {
        return null;
    }

    @Override
    public void update(User user) {

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
