package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.UserDTO;
import ecom.mlslsenarathna.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5174/")
public class UserController {
    final UserService userService;
    @PostMapping("/newRegistration")
    public void registration(@RequestBody UserDTO userDTO){
        userService.registrationNewUser(userDTO);

    }
}
