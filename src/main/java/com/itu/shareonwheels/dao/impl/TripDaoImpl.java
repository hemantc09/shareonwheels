package com.itu.shareonwheels.dao.impl;

import com.itu.shareonwheels.dao.TripDao;
import com.itu.shareonwheels.entity.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by nikitasonthalia on 10/9/15.
 */

@Repository
public class TripDaoImpl extends NamedParameterJdbcDaoSupport implements TripDao
{

    @Autowired
    public TripDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }
    public void update(Trip trip) {

    }

    public void delete(Trip trip) {

    }

    public Long create(Trip trip) {

        String tripType = trip.getTripType();
        if (tripType == "Routine") {
            final String Trip_Creation_Query = "insert into Trip_Table (Start_Location,Destination,Trip_Time,Seat_Available,User_Id,User_Type,Days_of_Week,Frequency,Trip_Type)" +
                    "values(:startLocation , :destination , :tripTime, :seatAvailable, :userId, :userType, :daysOfWeek, :frequency,:tripType)";

            KeyHolder keyHolder = new GeneratedKeyHolder();
            getNamedParameterJdbcTemplate().update(
                   Trip_Creation_Query,
                    new MapSqlParameterSource()
                            .addValue("startLocation", trip.getStartLocation())
                            .addValue("destination", trip.getDestination())
                            .addValue("tripTime", trip.getTripTime())
                            .addValue("seatAvailable", trip.getSeatAvailable())
                            .addValue("userId", trip.getUserId())
                            .addValue("userType", trip.getUserType())
                            .addValue("daysOfWeek", trip.getDayOfWeek())
                            .addValue("frequency", trip.getFrequency())
                            .addValue("tripType", trip.getTripType()),

                    keyHolder);
            return keyHolder.getKey().longValue();


        } else {
            final String OnetimeTrip_Creation_Query = "insert into Trip_Table (Start_Location,Destination,Trip_Time,Seat_Available,User_Id,User_Type,Trip_Date,Trip_Type)" +
                    "values(:startLocation , :destination , :tripTime, :seatAvailable, :userId, :userType, :tripDate, :tripType)";


            KeyHolder keyHolder = new GeneratedKeyHolder();
            getNamedParameterJdbcTemplate().update(
                    OnetimeTrip_Creation_Query,
                    new MapSqlParameterSource()
                            .addValue("startLocation", trip.getStartLocation())
                            .addValue("destination", trip.getDestination())
                            .addValue("tripTime", trip.getTripTime())
                            .addValue("seatAvailable", trip.getSeatAvailable())
                            .addValue("userId", trip.getUserId())
                            .addValue("userType", trip.getUserType())
                            .addValue("tripDate", trip.getTripDate())
                            .addValue("tripType", trip.getTripType()),

                    keyHolder);
            return keyHolder.getKey().longValue();


        }


    }

    public Trip tripSearch(Trip trip)
    {

        String startLocation = trip.getStartLocation();
        String destination=trip.getDestination();
        String tripTime=trip.getTripTime();
        String userType;
        String tripDate=trip.getTripDate();


        if(startLocation!=null)
        {
            if(destination!=null)
            {
                if(tripDate!=null)
                {
                    if(tripTime!=null)
                    {
                        String Trip_Request_Query =  "select * from Trip_table WHERE Start_Location=:startLocation and Destination = :destination and Trip_Date = :tripDate and Trip_Time=:tripTime and Seat_Available>0";
                      SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("startLocation",startLocation)
                                                                                        .addValue("destination",destination)
                                                                                        .addValue("tripDate",tripDate)
                                                                                        .addValue("tripTime",tripTime);
                       trip = (Trip)getNamedParameterJdbcTemplate().query(Trip_Request_Query,namedParameters,new BeanPropertyRowMapper(Trip.class));
                        return trip;




                    }
                    else
                    {
                        String Trip_Request_Query =  "select  * from Trip_table WHERE Start_Location=:startLocation and Destination = :destination and Trip_Date = :tripDate and Trip_Time= current_time and Seat_Available>0";
                        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("startLocation", startLocation)
                                .addValue("destination",destination)
                                .addValue("tripDate",tripDate);
                        trip = (Trip)getNamedParameterJdbcTemplate().query(Trip_Request_Query,namedParameters,new BeanPropertyRowMapper(Trip.class));
                        return trip;


                    }


                }
                else
                {
                    if(tripTime!=null) {
                        String Trip_Request_Query = "select * from Trip_table WHERE Start_Location=:startLocation and Destination = : destination and Trip_Date = current_date and Trip_Time=:tripTime and Seat_Available>0";
                        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("startLocation", startLocation)
                                .addValue("destination",destination)
                                .addValue("tripTime", tripTime);

                        trip = (Trip)getNamedParameterJdbcTemplate().query(Trip_Request_Query,namedParameters,new BeanPropertyRowMapper(Trip.class));
                        return trip;

                    }
                    else
                    {
                        String Trip_Request_Query = "select * from Trip_table WHERE Start_Location=:startLocation and Destination = : destination and Trip_Date = current_date and Trip_Time=current_time and Seat_Available>0";
                        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("startLocation",startLocation)
                                .addValue("destination",destination);
                        trip = (Trip)getNamedParameterJdbcTemplate().query(Trip_Request_Query,namedParameters,new BeanPropertyRowMapper(Trip.class));
                        return trip;

                    }

                }
            }
            else
            {
                // pass error
            }


        }
        else
        {
                // pass error
        }

        return trip;




    }
}