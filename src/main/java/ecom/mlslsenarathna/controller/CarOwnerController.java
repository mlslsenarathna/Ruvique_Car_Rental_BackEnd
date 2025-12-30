package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.CarOwnerDTO;
import ecom.mlslsenarathna.service.CarOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carOwner")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")
public class CarOwnerController {
    final CarOwnerService carOwnerService;

    @GetMapping("/getOwnerByNIC/{nic}")
    public CarOwnerDTO getOwnerById(@PathVariable String nic){
        return carOwnerService.getCarOwnerByNIC(nic.trim());
    }



}
