package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.AuthenticationDTO;
import ecom.mlslsenarathna.mode.dto.LogInRequestDTO;
import ecom.mlslsenarathna.mode.dto.LogInResponseDTO;
import ecom.mlslsenarathna.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")
public class AuthenticationController {
    final AuthenticationService authenticationService;
    @PutMapping("/setPassword")
    public void setPassword(@RequestBody AuthenticationDTO authenticationDTO){
        authenticationService.setAuthentication(authenticationDTO);
    }
    @PostMapping("/checkPassword")
    public LogInResponseDTO checkPassword(@RequestBody LogInRequestDTO logInRequest){
       return authenticationService.validateLogin(logInRequest.getNic().trim(),logInRequest.getPassword().trim());

    }
}
