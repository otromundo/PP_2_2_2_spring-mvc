package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1L, "CarModel1", 5));
        cars.add(new Car(2L, "CarModel2", 4));
        cars.add(new Car(3L, "CarModel3", 7));
        cars.add(new Car(4L, "CarModel4", 2));
        cars.add(new Car(5L, "CarModel5", 8));
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getList(int quantity) {
        return cars.stream().limit(quantity).toList();
    }
}
