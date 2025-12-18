package ecom.mlslsenarathna.mode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name ="rentalInfo")
public class RentalEntity {
    @Id
    private int rentalId;
    private String nic;
    private String carId;
    private String paymentDetail;
    private String status;
    private LocalDate getDate;
    private LocalDate recieveDate;
    private double price;
}
