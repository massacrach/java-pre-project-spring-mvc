package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarsDaoImpl implements CarsDao {
    private final List<Car> cars = new ArrayList<>();

    public CarsDaoImpl() {
        cars.add(new Car("Toyota", "FJ Cruiser", 2010));
        cars.add(new Car("Mini", "Hatch", 2013));
        cars.add(new Car("Honda", "CR-V", 2005));
        cars.add(new Car("Renault", "Sandero", 2011));
        cars.add(new Car("Volkswagen", "Golf", 2008));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count <= 0) return cars;

        return cars.stream()
                .limit(count)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
