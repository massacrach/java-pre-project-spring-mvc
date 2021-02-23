package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarsService;

import java.util.List;

@Controller
public class CarsController {
    private CarsService carsService;

    @Autowired
    public void setCarsService(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) String count,
                          Model model) {
        int carsCount = 0;

        try {
            carsCount = Integer.parseInt(count);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid count value");
        }

        List<Car> cars = carsService.getCars(carsCount);

        model.addAttribute("cars", cars);

        return "cars";
    }
}
