package ecom.mlslsenarathna.service;


import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.mode.entity.CarEntity;

public interface CarService {
    void registerNewCar(CarDTO carDTO);

    void updateStatus(String status, String carId);

    CarDTO getCarById(String carId);

    void updateMileage(double milage, String carId);

    double getDrivenMileage(double newMileage, String carId);
}
