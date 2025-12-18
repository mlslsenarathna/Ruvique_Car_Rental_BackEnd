package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarOwnerDTO {
    private int ownerId;
    private String name;
    private String email;
    private String nic;
    private String phone;
    private String photoURL;
}
