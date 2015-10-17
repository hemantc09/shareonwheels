package com.itu.shareonwheels.dao.impl;

import com.itu.shareonwheels.dao.TripDao;
import com.itu.shareonwheels.entity.Trip;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 * Created by nikitasonthalia on 10/9/15.
 */

@Repository
public class TripDaoImpl extends NamedParameterJdbcDaoSupport implements TripDao {


  /* private static final String OnetimeTrip_Creation_Query= "insert into Trip_Table (Start_Location,Destination,Trip_Time,Seat_Available,UserId,User_Type,Trip_Date,User_Type,Days_of_week,Frequency,Trip_type)" +
           "values(:startLocation , :destination , :tripTime, :seatAvailable, :userId, :userType, :tripDate,:daysOfWeek, :frequency,:tripType)"; */








    public void insert(Trip trip) {

    }

    public void update(Trip trip) {

    }

    public void delete(Trip trip) {

    }

    public long create(Trip trip) {

        String triptype = trip.getTripType();
        if ( triptype=="Routine")
        {
              final String OnetimeTrip_Creation_Query= "insert into Trip_Table (Start_Location,Destination,Trip_Time,Seat_Available,UserId,User_Type,User_Type,Days_of_week,Frequency,Trip_type)" +
                    "values(:startLocation , :destination , :tripTime, :seatAvailable, :userId, :userType, :daysOfWeek, :frequency,:tripType)";

            KeyHolder keyHolder = new GeneratedKeyHolder();
            getNamedParameterJdbcTemplate().update(
                    OnetimeTrip_Creation_Query,
                    new MapSqlParameterSource()
                            .addValue("startlocation", trip.getStartlocation())
                            .addValue("destiantion",trip.getDestination())
                            .addValue("triptime",trip.getTriptime())
                            .addValue("seatavailable",trip.getSeatavailable())
                            .addValue("userid",trip.getUserid())
                            .addValue("usertype",trip.getTripdate())
                            .addValue("daysOfWeek", trip.getDayOfWeek())
                            .addValue("frequency", trip.getFrequency())
                            .addValue("tripType", trip.getTripType()),

                    keyHolder);
            return keyHolder.getKey().longValue();


        }
        else
        {
              final String OnetimeTrip_Creation_Query= "insert into Trip_Table (Start_Location,Destination,Trip_Time,Seat_Available,UserId,User_Type,Trip_Date,User_Type,Trip_type)" +
                    "values(:startLocation , :destination , :tripTime, :seatAvailable, :userId, :userType, :tripDate, :tripType)";


            KeyHolder keyHolder = new GeneratedKeyHolder();
            getNamedParameterJdbcTemplate().update(
                    OnetimeTrip_Creation_Query,
                    new MapSqlParameterSource()
                            .addValue("startLocation", trip.getStartlocation())
                            .addValue("destiantion",trip.getDestination())
                            .addValue("tripTime",trip.getTriptime())
                            .addValue("seatAvailable",trip.getSeatavailable())
                            .addValue("userid",trip.getUserid())
                            .addValue("userType",trip.getTripdate())
                            .addValue("tripDate", trip.getTripdate())
                            .addValue("tripType", trip.getTripType()),

                    keyHolder);
            return keyHolder.getKey().longValue();


        }

       /* KeyHolder keyHolder = new GeneratedKeyHolder();
        getNamedParameterJdbcTemplate().update(
                OnetimeTrip_Creation_Query,
                new MapSqlParameterSource()
                .addValue("startlocation", trip.getStartlocation())
                        .addValue("destiantion",trip.getDestination())
                        .addValue("triptime",trip.getTriptime())
                        .addValue("seatavailable",trip.getSeatavailable())
                        .addValue("userid",trip.getUserid())
                        .addValue("usertype",trip.getTripdate())
                        .addValue("daysOfWeek", trip.getDayOfWeek())
                        .addValue("frequency", trip.getFrequency())
                        .addValue("tripType", trip.getTripType()),

                keyHolder);


        return keyHolder.getKey().longValue();*/
    }
}
