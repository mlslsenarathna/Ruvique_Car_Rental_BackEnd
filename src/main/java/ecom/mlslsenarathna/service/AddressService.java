package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.AddressDTO;

public interface AddressService {
    void addNewAddress(AddressDTO addressDTO);

    AddressDTO getAddressByNic(String nic);
}
