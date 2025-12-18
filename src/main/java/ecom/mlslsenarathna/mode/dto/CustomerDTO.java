package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {
    private int customerId;
    private String name;
    private String email;
    private String nic;
    private String phone;
    private String photoURL;
}
