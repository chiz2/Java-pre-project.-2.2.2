package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarsService service;

    /*@GetMapping("/cars")
    public String getCars(ModelMap model) {
        List<Car> cars = service.getCars();
        model.addAttribute("cars", cars);
        return "cars";
    }*/

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false) Integer count, ModelMap model) throws NullPointerException {
        List<Car> cars = new ArrayList<>();
        if (count == null || count >= 5) {
            cars.addAll(service.getCars());

        } else {
            cars.addAll(service.getCars(count));
        }
        model.addAttribute("cars", cars);
        return "cars";
    }


}
