package com.itu.shareonwheels.service;

import com.itu.shareonwheels.entity.User;

/**
 * Created by ramya on 11/4/15.
 */
public interface UserService extends GenericService<User, Long> {

    User get(String userName);

}
