package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.AddressDTO;
import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.mode.entity.AddressEntity;
import ecom.mlslsenarathna.repository.AddressRepository;
import ecom.mlslsenarathna.service.AddressService;
import ecom.mlslsenarathna.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    final AddressRepository addressRepository;
    final CustomerService customerService;
    ModelMapper mapper=new ModelMapper();
    @Override
    public void addNewAddress(AddressDTO addressDTO) {
        addressRepository.save(mapper.map(addressDTO,AddressEntity.class));
    }

    @Override
    public AddressDTO getAddressByNic(String nic) {

        return null;
    }

}
