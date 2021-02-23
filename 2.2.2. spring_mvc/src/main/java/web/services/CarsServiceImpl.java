package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {
    private CarsDao carsDao;

    @Autowired
    public void setCarsDao(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carsDao.getCars(count);
    }
}
