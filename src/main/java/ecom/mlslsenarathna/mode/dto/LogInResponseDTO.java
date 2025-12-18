package ecom.mlslsenarathna.mode.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LogInResponseDTO {
    private String status;
    private String message;
    private String role;
    private String nic;
}
