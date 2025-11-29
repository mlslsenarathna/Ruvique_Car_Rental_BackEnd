package ecom.mlslsenarathna.mode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "address")
public class AddressEntity {
    @Id
    private String nic;
    private String addressLine1;
    private String adddressLine2;
    private String city;
    private String district;
    private String postalCode;
    private String country;
}
