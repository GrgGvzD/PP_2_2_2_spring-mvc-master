package web.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
//@Component
public class Car {

    private String model;

    private int enginePower;

    private int price;

    public Car(String model, int enginePower, int price) {
        this.model = model;
        this.enginePower = enginePower;
        this.price = price;
    }
}
