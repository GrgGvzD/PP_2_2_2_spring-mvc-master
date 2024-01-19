package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO{

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", 100, 500000));
        cars.add(new Car("Lada", 82, 350000));
        cars.add(new Car("Audi", 150, 2500000));
        cars.add(new Car("ZAZ", 50, 50000));
        cars.add(new Car("Kia", 120, 800000));
    }



    @Override
    public List<Car> getCarsList(int amount) {
        if (amount == 0 || amount >= 5) {
            return cars;
        }
        return cars.stream().limit(amount).collect(Collectors.toList());
    }


}
