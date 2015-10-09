package com.itu.shareonwheels.dao.impl;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 * Created by ramya on 10/7/15.
 */
@Repository
public class UserDaoImpl extends NamedParameterJdbcDaoSupport implements UserDao {

    private static final String USER_CREATION_QUERY = "insert into user (user_id, user_name, first_name, last_name, email, phone, password) " +
            "values (user_seq.nextVal, :userName, :firstName, :lastName, :email, :phone, :password)";

    private static final String USER_UPDATION_QUERY = "update user SET first_name = :firstName,last_Name = :lastName,phone_number = :phoneNumber,"+
           " address = :address, gender = :gender, date_of_birth = :dateOfBirth WHERE user_id = :userId";

    private static final String USER_DELETION_QUERY = "DELETE FROM user WHERE user_id = :userId";




    public Long create(User user) {

        KeyHolder userIdHolder = new GeneratedKeyHolder();

        getNamedParameterJdbcTemplate().update(
                USER_CREATION_QUERY,
                new MapSqlParameterSource()
                        .addValue("userName", user.getUserName())
                        .addValue("firstName", user.getFirstName())
                        .addValue("lastName", user.getLastName())
                        .addValue("email", user.getEmailAddress())
                        .addValue("phone", user.getPhoneNumber())
                        .addValue("password", user.getPassword()),
                userIdHolder);

        return userIdHolder.getKey().longValue();

    }


    public void update(User user) {
        getNamedParameterJdbcTemplate().update(USER_UPDATION_QUERY,new MapSqlParameterSource()
                        .addValue("firstName",user.getFirstName())
                        .addValue("lastName",user.getLastName())
                        .addValue("phoneNumber",user.getPhoneNumber())
                        .addValue("address",user.getAddress())
                        .addValue("gender",user.getGender())
                        .addValue("userId",user.getUserId())
                        .addValue("dateOfBirth",user.getDateOfBirth()));
    }


    public void delete(Long userId) {
        getNamedParameterJdbcTemplate().update(USER_DELETION_QUERY,new MapSqlParameterSource()
                            .addValue("userId",userId));
    }


}
