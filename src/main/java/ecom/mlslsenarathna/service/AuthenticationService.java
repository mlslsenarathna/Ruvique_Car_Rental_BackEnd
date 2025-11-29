package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.AuthenticationDTO;
import ecom.mlslsenarathna.mode.dto.LogInResponse;

public interface AuthenticationService {
    void setAuthentication(AuthenticationDTO authenticationDTO);
    LogInResponse validateLogin(String nic, String plainPassword);

}
