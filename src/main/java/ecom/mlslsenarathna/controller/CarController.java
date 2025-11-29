package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.service.CarService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    final CarService carService;


    @PutMapping("/registerNewCar")
    public void updateCustomer(@RequestBody CarDTO carDTO){
        carService.registerNewCar(carDTO);
    }
    @PostMapping("/setStatus/{status}")
    public void setStatus(@PathVariable String status,@RequestParam("id") String carId){
        carService.updateStatus(status,carId);
    }
    @PostMapping("/updateMilage/{mileage}")
    public void updateMilage(@PathVariable double mileage,@RequestParam("id") String carId){
        carService.updateMileage(mileage,carId);
    }
    @PostMapping("/getDrivenMileage/{newMileage}")
    public double getDrivenMileage(@PathVariable double newMileage,@RequestParam("id") String carId){
       return carService.getDrivenMileage(newMileage,carId);
    }



}
