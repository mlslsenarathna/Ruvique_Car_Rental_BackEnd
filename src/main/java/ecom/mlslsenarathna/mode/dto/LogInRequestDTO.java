package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LogInRequestDTO {
    private String nic;
    private String password;
}
