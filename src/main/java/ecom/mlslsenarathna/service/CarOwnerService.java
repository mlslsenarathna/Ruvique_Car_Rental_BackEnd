package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.CarOwnerDTO;
import org.springframework.stereotype.Service;


public interface CarOwnerService {
    void registerNewCarOwner(CarOwnerDTO carOwnerDTO);

    int getNewOwnerId();
}
