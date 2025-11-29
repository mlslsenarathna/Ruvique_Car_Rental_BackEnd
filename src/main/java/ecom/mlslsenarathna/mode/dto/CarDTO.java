package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO {
    private String carId;
    private String brand;
    private String model;
    private String year;
    private String fuelType;
    private String transmission;
    private String color;
    private double dailyRate;
    private double mileage;
    private int seats;
    private String availability;
    private String imageUrl;

}
