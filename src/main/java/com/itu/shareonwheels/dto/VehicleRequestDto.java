package com.itu.shareonwheels.dto;

import com.itu.shareonwheels.entity.Driver;
import com.itu.shareonwheels.enumerations.VehicleType;

/**
 * Created by ramya on 10/8/15.
 */
public class VehicleRequestDto {

    //DB generated vehicle Id
    private Long vehicleId;

    //e.g. Nissan Altima
    private String model;

    //# of passengers
    private int capacity;

    private String licencePlateNumber;

    private VehicleType vehicleType;

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
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

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
