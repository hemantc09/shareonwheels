package com.itu.shareonwheels.entity;

import com.itu.shareonwheels.enumerations.VehicleType;

/**
 * Created by ramya on 9/30/15.
 */
public class Vehicle {

    //DB generated vehicle Id
    private Long vehicleId;

    //e.g. Nissan
    private String make;

    //e.g. Altima
    private String model;

    //# of passengers
    private int capacity;

    private String licenceNumber;

    private String state;

    private VehicleType vehicleType;

    private Driver owner;


    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Driver getOwner() {
        return owner;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }
}
