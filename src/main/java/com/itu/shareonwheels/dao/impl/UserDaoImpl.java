package com.itu.shareonwheels.dao.impl;

import com.itu.shareonwheels.dao.UserDao;
import com.itu.shareonwheels.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ramya on 10/7/15.
 */
@Repository
public class UserDaoImpl extends NamedParameterJdbcDaoSupport implements UserDao {

    @Autowired
    public UserDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    private static final String USER_CREATION_QUERY = "insert into user (user_name, first_name, last_name, email_address, phone_number, password) " +
            "values (:userName, :firstName, :lastName, :email, :phone, :password)";

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

    public boolean verifyLogin(String userName, String password) {
        String VERIFY_USER_LOGIN_QUERY =  "select count(*) from user WHERE userName=:userName and password = :password";

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("userName",userName).addValue("password",password);

        int rowCount = getNamedParameterJdbcTemplate().queryForObject(VERIFY_USER_LOGIN_QUERY,
                namedParameters,
                Integer.class);

        if(rowCount == 1){
            return true;
        }
        else{
            return false;
        }
    }


}
