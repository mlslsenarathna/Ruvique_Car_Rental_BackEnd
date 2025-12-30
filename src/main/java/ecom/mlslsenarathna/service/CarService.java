package ecom.mlslsenarathna.service;


import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.mode.entity.CarEntity;

import java.util.List;


public interface CarService {
    void registerNewCar(CarDTO carDTO);

    void updateStatus(String status, String carId);

    CarDTO getCarById(String carId);

    void updateMileage(double milage, String carId);

    double getDrivenMileage(double newMileage, String carId);

    void updateDailyRate(double dailyRate, String carId);

    List<CarDTO> getCarsByModel(String model);

    List<CarDTO> getCarsByCategory(String category);

    List<CarDTO> getCarByTransmission(String transmission);

    List<CarDTO> getCarByOwner(String nic);

    List<CarDTO> getAllCars();
}
