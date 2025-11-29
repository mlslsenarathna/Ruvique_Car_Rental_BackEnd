package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.AddressDTO;
import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.mode.dto.UserDTO;
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
        /*    private int customerId;
    private String name;
    private String email;
    private String nic;
    private String phone;
    private String address;*/
        if (userDTO.getRole().equals("Customer")){
            customerService.registerNewCustomer(new CustomerDTO(
                    customerService.getNewCustomerId(),
                    userDTO.getName(),
                    userDTO.getEmail(),
                    userDTO.getNic(),
                    userDTO.getPhone()
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
