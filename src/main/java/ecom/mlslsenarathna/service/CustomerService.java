package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getCustomerList();

    CustomerDTO getCustomerById(String id);

    CustomerDTO getCustomerByMobile(String mobile);

    CustomerDTO getCustomerByEmail(String email);
    CustomerDTO getCustomerByNic(String nic);


    void updateCustomerInfo(CustomerDTO customerDTO);

    void registerNewCustomer(CustomerDTO customerDTO);

    int getNewCustomerId();


}
