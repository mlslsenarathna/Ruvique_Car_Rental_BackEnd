package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.mode.dto.RentalDTO;

public interface PaymentService {
    void registerPaymentService(CarDTO carDTO, RentalDTO rentalDTO);
}
