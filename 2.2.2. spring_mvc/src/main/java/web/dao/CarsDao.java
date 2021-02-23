package web.dao;

import web.models.Car;
import java.util.List;

public interface CarsDao {
    public List<Car> getCars(Integer count);
}
