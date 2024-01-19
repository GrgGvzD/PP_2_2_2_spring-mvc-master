package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

@Controller
//@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String goToCars() {
        return "cars";
    }


}
