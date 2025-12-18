package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.RentalDTO;
import ecom.mlslsenarathna.mode.dto.UserDTO;
import ecom.mlslsenarathna.service.CustomerService;
import ecom.mlslsenarathna.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {
    final RentalService rentalService;
    @PostMapping("/rentalPayment")
    public void rentalPayments(@RequestBody RentalDTO rentalDTO){
        rentalService.registrationNewUser(rentalDTO);

    }
}
