package com.itu.shareonwheels.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import javax.sql.DataSource;

/**
 * Created by nikitasonthalia on 10/17/15.
 */
public class TripRequestDaoImpl extends NamedParameterJdbcDaoSupport{

    @Autowired
    public TripRequestDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }



}
