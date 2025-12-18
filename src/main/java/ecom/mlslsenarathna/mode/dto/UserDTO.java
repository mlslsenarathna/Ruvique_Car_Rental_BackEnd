package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private String name;
    private String email;
    private String nic;
    private String phone;
    private String address;
    private String password;
    private String photoURL;
    private String role;
    private String addressLine1;
    private String adddressLine2;
    private String city;
    private String district;
    private String postalCode;
    private String country;
}
