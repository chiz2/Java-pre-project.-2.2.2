package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList();
        Car car1  = new Car("Mersedes", 126, 220);
        Car car2  = new Car("Nissan", 602, 328);
        Car car3  = new Car("Mazda", 626, 180);
        Car car4  = new Car("Opel", 5, 110);
        Car car5  = new Car("BMW", 7, 380);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
}
