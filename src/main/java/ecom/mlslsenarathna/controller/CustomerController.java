package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    final CustomerService customerService;


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


}
