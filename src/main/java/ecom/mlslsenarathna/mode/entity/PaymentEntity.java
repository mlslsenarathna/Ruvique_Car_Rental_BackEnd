package ecom.mlslsenarathna.mode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name ="paymentInfo")
public class PaymentEntity {
    @Id
    private int rentalId;
    private String carOwnerNIC;
    private String customerNIC;
    private LocalDateTime paymentDateTime;
    private double paymentPrice;
}
