package com.itu.shareonwheels.dao;

import com.itu.shareonwheels.entity.User;

/**
 * Created by ramya on 9/28/15.
 */
public interface UserDao {

    Long create(User user);

    void update(User user);

    void delete(Long userId);
}
