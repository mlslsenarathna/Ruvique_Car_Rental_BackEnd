package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.RentalDTO;
import ecom.mlslsenarathna.mode.entity.RentalEntity;
import ecom.mlslsenarathna.repository.RentalRepository;
import ecom.mlslsenarathna.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final RentalRepository rentalRepository;
    ModelMapper mapper=new ModelMapper();
    @Override
    public void registrationNewUser(RentalDTO rentalDTO) {
        rentalRepository.save(mapper.map(rentalDTO, RentalEntity.class));

    }
}
