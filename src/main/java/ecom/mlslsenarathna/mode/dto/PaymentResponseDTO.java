package ecom.mlslsenarathna.mode.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentResponseDTO {
    private int rentalId;
    private String carId;
    private String carOwnerName;
    private String carOwnerContactNo;
    private String addressLine1;
    private String adddressLine2;
    private String city;
    private String district;
    private String postalCode;
    private String customerName;
    private LocalDate bookingDate;
    private LocalDate recieveDate;
    private double paymentPrice;
}
