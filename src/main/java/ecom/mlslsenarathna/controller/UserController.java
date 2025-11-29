package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.UserDTO;
import ecom.mlslsenarathna.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    final UserService registrationService;
    @PostMapping("/newRegistration")
    public void registration(@RequestBody UserDTO userDTO){
        registrationService.registrationNewUser(userDTO);

    }
}
