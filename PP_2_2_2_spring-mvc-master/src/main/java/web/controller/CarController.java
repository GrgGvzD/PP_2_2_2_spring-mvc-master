package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping()
    public String getCars(@RequestParam( value = "count", required = false)Optional<Integer> count, Model model) {
        int amount = 0;
        if (count.isPresent()) {
            amount = count.get();
        }
        model.addAttribute("cars", carService.getCarsList(amount));
        return "cars";
    }

}
