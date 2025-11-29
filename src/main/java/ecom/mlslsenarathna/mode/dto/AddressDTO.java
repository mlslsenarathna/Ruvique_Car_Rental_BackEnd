package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDTO {
    private String nic;
    private String addressLine1;
    private String adddressLine2;
    private String city;
    private String district;
    private String postalCode;
    private String country;
}
