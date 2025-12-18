package ecom.mlslsenarathna.mode.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalDTO {
    private int rentalId;
    private String nic;
    private String carId;
    private String paymentDetail;
    private String status;
    private LocalDate getDate;
    private LocalDate recieveDate;
    private double price;

}
