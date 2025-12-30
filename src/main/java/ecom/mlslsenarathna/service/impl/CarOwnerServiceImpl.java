package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.CarOwnerDTO;
import ecom.mlslsenarathna.mode.entity.CarOwnerEntity;
import ecom.mlslsenarathna.repository.CarOwnerRepository;
import ecom.mlslsenarathna.service.CarOwnerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarOwnerServiceImpl implements CarOwnerService {
    final CarOwnerRepository carOwnerRepository;
    ModelMapper mapper=new ModelMapper();

    @Override
    public void registerNewCarOwner(CarOwnerDTO carOwnerDTO) {
        carOwnerRepository.save(mapper.map(carOwnerDTO, CarOwnerEntity.class));
    }

    @Override
    public int getNewOwnerId() {
        CarOwnerEntity carOwnerEntity=carOwnerRepository.findTopByOrderByOwnerIdDesc();
        return carOwnerEntity.getOwnerId()+1;
    }

    @Override
    public CarOwnerDTO getCarOwnerByNIC(String nic) {
        List<CarOwnerEntity> list=carOwnerRepository.findAll();
        for (CarOwnerEntity carOwnerEntity:list){
            if(carOwnerEntity.getNic().equalsIgnoreCase(nic)){
                return mapper.map(carOwnerEntity,CarOwnerDTO.class);
            }
        }
        return null;
    }
}
