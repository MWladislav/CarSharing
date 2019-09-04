package epam.training.finalproject.model.domain.mapper;

import epam.training.finalproject.model.domain.entity.Car;
import epam.training.finalproject.model.domain.entity.CarProfile;
import epam.training.finalproject.model.domain.entity.enums.CarBodyType;
import epam.training.finalproject.model.domain.entity.enums.CarEngineType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        Car carProfile = new Car();
        carProfile.setId(resultSet.getInt("idCar"));
        carProfile.setRegistrationNumber(resultSet.getString("registration_number"));
        carProfile.setAvailable(resultSet.getBoolean("available"));
        carProfile.setDeleted(resultSet.getInt("is_deleted")==1);
        return carProfile;
    }
}
