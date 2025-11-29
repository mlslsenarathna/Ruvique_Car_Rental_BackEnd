package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.AuthenticationDTO;
import ecom.mlslsenarathna.mode.dto.LogInRequest;
import ecom.mlslsenarathna.mode.dto.LogInResponse;
import ecom.mlslsenarathna.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
@RequiredArgsConstructor
public class AuthenticationController {
    final AuthenticationService authenticationService;
    @PutMapping("/setPassword")
    public void setPassword(@RequestBody AuthenticationDTO authenticationDTO){
        authenticationService.setAuthentication(authenticationDTO);
    }
    @PutMapping("/checkPassword")
    public LogInResponse checkPassword(@RequestBody LogInRequest logInRequest){
       return authenticationService.validateLogin(logInRequest.getNic(),logInRequest.getPassword());

    }
}
