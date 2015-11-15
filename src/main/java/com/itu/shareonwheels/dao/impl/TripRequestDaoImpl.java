package com.itu.shareonwheels.dao.impl;

import com.itu.shareonwheels.dao.TripRequestDao;
import com.itu.shareonwheels.entity.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by nikitasonthalia on 10/17/15.
 */
@Repository
public class TripRequestDaoImpl extends NamedParameterJdbcDaoSupport implements TripRequestDao {



    @Autowired
    public TripRequestDaoImpl(DataSource dataSource){
        setDataSource(dataSource);
    }


    @Override
    public Long checkSeat(Trip trip) {
        return null;
    }
}
