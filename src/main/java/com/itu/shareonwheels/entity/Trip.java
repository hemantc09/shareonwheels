package com.itu.shareonwheels.entity;

import com.itu.shareonwheels.enumerations.TripType;
import com.itu.shareonwheels.util.Time;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ramya on 10/1/15.
 */
public class Trip {

    private Long tripId;

    //Optional
    private UUID tripReference;

    private TripType tripType;

    private String fromLocation;

    private String toLocation;

    private Date tripDate;

    private Time pickUpTime;

    private Time dropTime;

    private Driver driver;

    private DriverSchedule driverSchedule;

    private int seatsAvailable;

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    public Time getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Time pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public Time getDropTime() {
        return dropTime;
    }

    public void setDropTime(Time dropTime) {
        this.dropTime = dropTime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DriverSchedule getDriverSchedule() {
        return driverSchedule;
    }

    public void setDriverSchedule(DriverSchedule driverSchedule) {
        this.driverSchedule = driverSchedule;
    }

    public UUID getTripReference() {
        return tripReference;
    }

    public void setTripReference(UUID tripReference) {
        this.tripReference = tripReference;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }
}

