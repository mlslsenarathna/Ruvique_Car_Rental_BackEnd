package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.AddressDTO;
import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.service.CarService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")
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
    @PostMapping("/updateDailyRate/{dailyRate}")
    public void updateDailyRates(@PathVariable double dailyRate,@RequestParam("id") String carId){
        carService.updateDailyRate(dailyRate,carId.trim());
    }
    @GetMapping("/getCarsByModel/{model}")
    public List<CarDTO> getCarByModel(@PathVariable String model){
        return  carService.getCarsByModel(model.trim());
    }


    @GetMapping("/getCarsByCategory/{category}")
    public List<CarDTO> getCarByCategory(@PathVariable String category){
        return  carService.getCarsByCategory(category.trim());
    }
    @GetMapping("/getCarByTransmission/{transmission}")
    public List<CarDTO> getCarByTransmission(@PathVariable String transmission){
        return  carService.getCarByTransmission(transmission.trim());
    }
    @GetMapping("/getAllCars")
    public List<CarDTO> getAllCars(){
        return  carService.getAllCars();
    }
    @GetMapping("/getCarsByOwner/{nic}")
    public List<CarDTO> getCarsByOwner(@PathVariable String nic){
        return  carService.getCarByOwner(nic);
    }

    @GetMapping("/getCarById/{id}")
    public CarDTO getCarById(@PathVariable String id){
        return carService.getCarById(id.trim());

    }

}
