package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.mode.entity.CarEntity;
import ecom.mlslsenarathna.repository.CarRepository;
import ecom.mlslsenarathna.service.CarService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    final CarRepository carRepository;
    ModelMapper mapper=new ModelMapper();

    @Override
    public void registerNewCar(CarDTO carDTO) {
        carRepository.save(mapper.map(carDTO,CarEntity.class));
    }

    @Override
    public void updateStatus(String status, String carId) {
        CarDTO carDTO=getCarById(carId);
        carDTO.setAvailability(status.trim());
        carRepository.save(mapper.map(carDTO,CarEntity.class));
    }

    @Override
    public CarDTO getCarById(String carId) {
        Optional<CarEntity> car=carRepository.findById(carId.toLowerCase().trim());
        CarEntity carEntity=car.orElseThrow();
        return mapper.map(carEntity,CarDTO.class);
    }
    @Override
    public void updateMileage(double milage, String carId) {
        CarDTO carDTO=getCarById(carId);
        carDTO.setMileage(milage);
        carRepository.save(mapper.map(carDTO,CarEntity.class));
    }
    @Override
    public double getDrivenMileage(double newMileage, String carId) {
        CarDTO carDTO=getCarById(carId);
        updateMileage(newMileage,carId);
        return (newMileage-carDTO.getMileage());
    }

    @Override
    public void updateDailyRate(double dailyRate, String carId) {
        CarDTO carDTO=getCarById(carId);
        carDTO.setDailyRate(dailyRate);
    }
}
