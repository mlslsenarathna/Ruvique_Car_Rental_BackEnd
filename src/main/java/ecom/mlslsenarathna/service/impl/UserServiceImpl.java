package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.*;
import ecom.mlslsenarathna.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final CarOwnerService carOwnerService;
    final CustomerService customerService;
    final AuthenticationService authenticationService;
    final PasswordService passwordService;
    final AddressService addressService;

    @Override
    public void registrationNewUser(UserDTO userDTO) {
        if (userDTO.getRole().equalsIgnoreCase("Customer")){
            customerService.registerNewCustomer(new CustomerDTO(
                    customerService.getNewCustomerId(),
                    userDTO.getName(),
                    userDTO.getEmail(),
                    userDTO.getNic(),
                    userDTO.getPhone(),
                    userDTO.getPhotoURL()
            ));
            authenticationService.setAuthentication(new AuthenticationDTO(
                    userDTO.getNic(),
                    userDTO.getPassword(),
                    userDTO.getRole()
            ));
            addressService.addNewAddress(new AddressDTO(
                    userDTO.getNic(),
                    userDTO.getAddressLine1(),
                    userDTO.getAdddressLine2(),
                    userDTO.getCity(),
                    userDTO.getDistrict(),
                    userDTO.getPostalCode(),
                    userDTO.getCountry()
            ));


        }else if(userDTO.getRole().equalsIgnoreCase("Car_Owner")){
            carOwnerService.registerNewCarOwner(new CarOwnerDTO(
                    carOwnerService.getNewOwnerId(),
                    userDTO.getName(),
                    userDTO.getEmail(),
                    userDTO.getNic(),
                    userDTO.getPhone(),
                    userDTO.getPhotoURL()

            ));

            authenticationService.setAuthentication(new AuthenticationDTO(
                    userDTO.getNic(),
                    userDTO.getPassword(),
                    userDTO.getRole()
            ));
            addressService.addNewAddress(new AddressDTO(
                    userDTO.getNic(),
                    userDTO.getAddressLine1(),
                    userDTO.getAdddressLine2(),
                    userDTO.getCity(),
                    userDTO.getDistrict(),
                    userDTO.getPostalCode(),
                    userDTO.getCountry()
            ));

        }
    }
}
