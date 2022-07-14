package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService{

    private CarDaoImpl carDao;

    public CarsServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars().subList(0, count);
    }
}
