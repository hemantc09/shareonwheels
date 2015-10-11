package com.itu.shareonwheels.dao.impl;

import com.itu.shareonwheels.dao.VehicleDao;
import com.itu.shareonwheels.entity.Vehicle;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

/**
 * Created by ramya on 10/8/15.
 */
public class VehicleDaoImpl extends NamedParameterJdbcDaoSupport implements VehicleDao {

    private static final String VEHICLE_CREATION_QUERY = "insert into vehicle (vehicleId, carModelName, capacity, licencePlateNumber) " +
            "values (vehicle_seq.nextVal, :carModelName, :capacity, :licencePlateNumber)";

    private static final String VEHICLE_UPDATION_QUERY = "update vehicle SET car_model_name = :carModelName,capacity = :capacity,licence_plate_number = :licencePlateNumber WHERE vehicle_id = :vehicleId";

    private static final String VEHICLE_DELETION_QUERY = "DELETE FROM vehicle WHERE vehicle_id = :vehicleId";

    @Override
    public Long create(Vehicle vehicle) {

        KeyHolder vehicleIdHolder = new GeneratedKeyHolder();

        getNamedParameterJdbcTemplate().update(
                VEHICLE_CREATION_QUERY,
                new MapSqlParameterSource()
                        .addValue("carModelName", vehicle.getModel())
                        .addValue("capacity", vehicle.getCapacity())
                        .addValue("licencePlateNumber", vehicle.getLicencePlateNumber()),
                vehicleIdHolder);

        return vehicleIdHolder.getKey().longValue();

    }

    @Override
    public void update(Vehicle vehicle) {

        getNamedParameterJdbcTemplate().update(
                VEHICLE_UPDATION_QUERY,
                new MapSqlParameterSource()
                        .addValue("carModelName", vehicle.getModel())
                        .addValue("capacity", vehicle.getCapacity())
                        .addValue("licencePlateNumber", vehicle.getLicencePlateNumber()));

    }

    @Override
    public void delete(Long vehicleId) {
        getNamedParameterJdbcTemplate().update(VEHICLE_DELETION_QUERY,new MapSqlParameterSource()
                .addValue("vehicleId",vehicleId));
    }
}
