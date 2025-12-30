package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.CarDTO;
import ecom.mlslsenarathna.mode.dto.RentalDTO;
import ecom.mlslsenarathna.mode.entity.PaymentEntity;
import ecom.mlslsenarathna.repository.PaymentRepository;
import ecom.mlslsenarathna.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl  implements PaymentService {
    final PaymentRepository paymentRepository;
    @Override
    public void registerPaymentService(CarDTO carDTO, RentalDTO rentalDTO) {
        paymentRepository.save(new PaymentEntity(
                rentalDTO.getRentalId(),
                carDTO.getNic(),
                rentalDTO.getNic(),
                LocalDateTime.now(),
                rentalDTO.getPrice()
        ));

    }
}
