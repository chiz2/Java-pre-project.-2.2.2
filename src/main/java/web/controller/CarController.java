package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarsServiceImpl service;

    public CarController(CarsServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false) Integer count, ModelMap model) throws NullPointerException {
        if (count == null  || count > 5) {
            model.addAttribute("cars", service.getCars());
        } else {
            model.addAttribute("cars", service.getCars(count));
        }
        return "cars";
    }


}
