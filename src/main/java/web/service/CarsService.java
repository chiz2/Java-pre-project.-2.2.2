package web.service;

import web.model.Car;

import java.util.List;

public interface CarsService {
    List<Car> getCars();
    List<Car> getCars(int x);
}
