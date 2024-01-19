package web.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Car {

    private String model;

    private int enginePower;

    private int groundClearance;

    public Car(String model, int enginePower, int groundClearance) {
        this.model = model;
        this.enginePower = enginePower;
        this.groundClearance = groundClearance;
    }
}
