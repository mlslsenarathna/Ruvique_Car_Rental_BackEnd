package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.CustomerDTO;
import ecom.mlslsenarathna.mode.entity.CustomerEntity;
import ecom.mlslsenarathna.repository.CustomerRepository;
import ecom.mlslsenarathna.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository customerRepository;
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
}
