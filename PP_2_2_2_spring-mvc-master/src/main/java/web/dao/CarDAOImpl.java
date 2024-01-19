package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> carList;

    @Override
    public List<Car> getCarsList(int amountOfCars) {
        List<Car> carList = new ArrayList<>();
        List<String> modelList = List.of("Ford","Lada","Audi","Subaru", "Kia","Toyota","ZAZ");
        Random rm = new Random(modelList.size()-1);
        for (int i = 0; i <amountOfCars; i++) {
            String model = modelList.get((rm.nextInt(modelList.size() - 1)));
            int randCl = rm.nextInt(10000 - 2000 + 1) + 2000;
            int randEngine = rm.nextInt(5000 - 1000 + 1) + 1000;
            carList.add(new Car(model, randEngine, randCl));
        }
        return carList;
    }
}
