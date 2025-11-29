package ecom.mlslsenarathna.service;


import ecom.mlslsenarathna.mode.dto.CarDTO;


public interface CarService {
    void registerNewCar(CarDTO carDTO);

    void updateStatus(String status, String carId);

    CarDTO getCarById(String carId);

    void updateMileage(double milage, String carId);

    double getDrivenMileage(double newMileage, String carId);

    void updateDailyRate(double dailyRate, String carId);
}
