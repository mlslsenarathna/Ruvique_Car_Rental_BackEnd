package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.PaymentResponseDTO;
import ecom.mlslsenarathna.mode.dto.RentalDTO;

public interface RentalService {
    void registrationNewUser(RentalDTO rentalDTO);

    void updateRentalStatus(RentalDTO rentalDTO);

    void updateRentalStatus(String status, String rentalId);

    PaymentResponseDTO completePayments(RentalDTO rentalDTO);

    //  PaymentResponseDTO completePayments(RentalDTO rentalDTO);
}
