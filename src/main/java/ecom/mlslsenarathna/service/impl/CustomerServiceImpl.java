package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.AuthenticationDTO;
import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.mode.entity.CustomerEntity;
import ecom.mlslsenarathna.repository.CustomerRepository;
import ecom.mlslsenarathna.service.AuthenticationService;
import ecom.mlslsenarathna.service.CustomerService;
import ecom.mlslsenarathna.service.PasswordService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository customerRepository;
    final PasswordService passwordService;
    final AuthenticationService authenticationService;
    ModelMapper mapper=new ModelMapper();
    @Override
    public List<CustomerDTO> getCustomerList() {
        List<CustomerEntity> list=customerRepository.findAll();
        List<CustomerDTO> dtoList=new ArrayList<>();

        for (CustomerEntity customerEntity:list){
            dtoList.add(
                    mapper.map(customerEntity,CustomerDTO.class)
            );

        }
        return dtoList;
    }

    @Override
    public CustomerDTO getCustomerById(String id) {
       Optional<CustomerEntity> customer=  customerRepository.findById(Integer.parseInt(id));
       CustomerEntity customerEntity=customer.orElseThrow();
       return mapper.map(customerEntity,CustomerDTO.class);
    }

    @Override
    public CustomerDTO getCustomerByMobile(String mobile) {
        CustomerEntity customerEntity=customerRepository.findByPhone(mobile);
        return mapper.map(customerEntity,CustomerDTO.class);
    }

    @Override
    public CustomerDTO getCustomerByEmail(String email) {
        CustomerEntity customerEntity=customerRepository.findByEmail(email);
        return mapper.map(customerEntity,CustomerDTO.class);
    }

    @Override
    public CustomerDTO getCustomerByNic(String nic) {
        CustomerEntity customerEntity=customerRepository.findByNic(nic);
        return mapper.map(customerEntity,CustomerDTO.class);
    }

    @Override
    public void updateCustomerInfo(CustomerDTO customerDTO) {
        customerRepository.save(mapper.map(customerDTO,CustomerEntity.class));
    }

    @Override
    public void registerNewCustomer(CustomerDTO customerDTO) {
        customerRepository.save(mapper.map(customerDTO,CustomerEntity.class));
        String password=customerDTO.getNic().substring(0,5);
        authenticationService.setAuthentication(new AuthenticationDTO(
                customerDTO.getNic(),
                password,
                "Customer"
                ));
    }

    @Override
    public int getNewCustomerId() {
        CustomerEntity customerEntity=getLastCustomer();
        int lastId=customerEntity.getCustomerId();

        return (lastId+1);
    }

//    @Override
//    public CustomerDTO getCustomerByNIC(String nic) {
//        return mapper.map(customerRepository.findBYnic(nic),CustomerDTO.class);
//    }

    public CustomerEntity getLastCustomer(){
        return customerRepository.findTopByOrderByCustomerIdDesc();
    }


}
