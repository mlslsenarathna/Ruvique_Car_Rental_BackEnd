package ecom.mlslsenarathna.mode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "car")
public class CarEntity {
    @Id
    private int carId;
    private String category;
    private String nic;
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
