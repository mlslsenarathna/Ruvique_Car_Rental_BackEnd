package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.AuthenticationDTO;
import ecom.mlslsenarathna.mode.dto.LogInResponseDTO;

public interface AuthenticationService {
    void setAuthentication(AuthenticationDTO authenticationDTO);
    LogInResponseDTO validateLogin(String nic, String plainPassword);

}
