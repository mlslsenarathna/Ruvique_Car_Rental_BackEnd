package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.service.AddressService;
import ecom.mlslsenarathna.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    final CustomerService customerService;
    final AddressService addressService;
    @GetMapping("/getCustomerName")
    public List<CustomerDTO> getCustomer(){
       return customerService.getCustomerList();
    }
    @GetMapping("/getCustomerById/{id}")
    public CustomerDTO getCustomerById(@PathVariable String id){
        return customerService.getCustomerById(id.trim());
    }

    @GetMapping("/getCustomerByPhone/{mobile}")
    public CustomerDTO getCustomerByPhone(@PathVariable String mobile){
        return customerService.getCustomerByMobile(mobile.trim());
    }
    @GetMapping("/getCustomerByMail/{email}")
    public  CustomerDTO getCustomerbyEmail(@PathVariable String email){
        return  customerService.getCustomerByEmail(email.trim());
    }
    @PutMapping("/updateCustomer")
    public void updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.updateCustomerInfo(customerDTO);
    }
    /*
//    @GetMapping("/registerNewCustomer")
//    public void registerNewCustomer(@RequestBody CustomerDTO customerDTO){
//        customerService.registerNewCustomer(customerDTO);
//    }

     */
    @GetMapping("/getCustomerByNic/{nic}")
    public CustomerDTO getCustomerAddressBynic(@PathVariable String nic) {
        return customerService.getCustomerByNic(nic);
    }
}
