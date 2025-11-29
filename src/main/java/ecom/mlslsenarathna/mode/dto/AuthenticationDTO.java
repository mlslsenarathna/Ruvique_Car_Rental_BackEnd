package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthenticationDTO {
    private String nic;
    private String password;
    private String role;
}
