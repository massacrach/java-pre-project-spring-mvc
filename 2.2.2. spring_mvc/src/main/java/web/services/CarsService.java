package web.services;

import web.models.Car;
import java.util.List;

public interface CarsService {
    public List<Car> getCars(Integer count);
}
