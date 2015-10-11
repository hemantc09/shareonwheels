package com.itu.shareonwheels.service;

import com.itu.shareonwheels.dao.VehicleDao;
import com.itu.shareonwheels.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ramya on 10/8/15.
 */
public class VehicleService implements  GenericService <Vehicle, Long>{
    @Autowired
    VehicleDao vehicleDao;


    @Override
    public Long create(Vehicle vehicle) {
        return vehicleDao.create(vehicle);
    }

    @Override
    public void update(Vehicle vehicle) {
        vehicleDao.update(vehicle);
    }

    @Override
    public Vehicle get(Long aLong) {
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }

    @Override
    public void removeById(Long aLong) {
        vehicleDao.delete(aLong);

    }
}
