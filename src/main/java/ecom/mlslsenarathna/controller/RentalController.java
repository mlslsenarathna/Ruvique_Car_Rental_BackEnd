package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.PaymentResponseDTO;
import ecom.mlslsenarathna.mode.dto.RentalDTO;
import ecom.mlslsenarathna.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {
    final RentalService rentalService;
    @PostMapping("/rentalPayment")
    public void rentalPayments(@RequestBody RentalDTO rentalDTO){
        rentalService.registrationNewUser(rentalDTO);

    }
    @GetMapping("/updateStatus/{status}")
    public void updateRentalStatus(@PathVariable String status,@RequestParam("id") String rentalId){
        rentalService.updateRentalStatus(status,rentalId.trim());
    }
    @PutMapping("/completePayments")
    public PaymentResponseDTO completePayment(@RequestBody RentalDTO rentalDTO){
        return rentalService.completePayments(rentalDTO);

    }
//    @PostMapping("/updateDailyRate/{dailyRate}")
//    public void updateDailyRates(@PathVariable double dailyRate,@RequestParam("id") String carId){
//        carService.updateDailyRate(dailyRate,carId.trim());
//    }


}
