package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.*;
import ecom.mlslsenarathna.mode.entity.CarEntity;
import ecom.mlslsenarathna.mode.entity.RentalEntity;
import ecom.mlslsenarathna.repository.RentalRepository;
import ecom.mlslsenarathna.service.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final RentalRepository rentalRepository;
    final CarService carService;
    final CarOwnerService carOwnerService;
    final CustomerService customerService;
    final AddressService addressService;
    final PaymentService paymentService;
    ModelMapper mapper=new ModelMapper();
    @Override
    public void registrationNewUser(RentalDTO rentalDTO) {
        rentalRepository.save(mapper.map(rentalDTO, RentalEntity.class));

    }

    @Override
    public void updateRentalStatus(RentalDTO rentalDTO) {
        rentalRepository.save(mapper.map(rentalDTO, RentalEntity.class));


    }

    @Override
    public void updateRentalStatus(String status, String rentalId) {
        Optional<RentalEntity> rental=rentalRepository.findById(Integer.valueOf(rentalId));
        RentalEntity rentalEntity=rental.orElseThrow();
        rentalEntity.setStatus(status);
        updateRentalStatus(mapper.map(rentalEntity,RentalDTO.class));

    }
    /* private int rentalId;
    private String nic;
    private String carId;
    private String paymentDetail;
    private String status;
    private LocalDate getDate;
    private LocalDate recieveDate;
    private double price;*/
    /*  private String rentalId;
    private String carId;
    private String carOwnerName;
    private String carOwnerContactNo;
    private String addressLine1;
    private String adddressLine2;
    private String city;
    private String district;
    private String postalCode;

    private String customerName;
    private LocalDate bookingDate;
    private LocalDate recieveDate;
    private double paymentPrice;*/

    @Override
    public PaymentResponseDTO completePayments(RentalDTO rentalDTO) {
        CarDTO carDTO=carService.getCarById(rentalDTO.getCarId());
        CarOwnerDTO carOwnerDTO=carOwnerService.getCarOwnerByNIC(carDTO.getNic());
        CustomerDTO customerDTO=customerService.getCustomerByNic(rentalDTO.getNic());
        AddressDTO addressDTO=addressService.getAddressByNic(carOwnerDTO.getNic());
        Boolean isPaid =false;
        System.out.println("Car"+carDTO.toString());
        System.out.println("CarOwner"+carOwnerDTO.toString());
        System.out.println("Customer"+customerDTO.toString());
        System.out.println("Address"+addressDTO.toString());
        if(rentalDTO.getStatus().equalsIgnoreCase("Completed")) {
             completePayments(carDTO, rentalDTO);
            System.out.println("Complete");
             isPaid=true;
        }
        if(isPaid){
            return new PaymentResponseDTO(
                    rentalDTO.getRentalId(),
                    rentalDTO.getCarId(),
                    carOwnerDTO.getName(),
                    carOwnerDTO.getPhone(),
                    addressDTO.getAddressLine1(),
                    addressDTO.getAdddressLine2(),
                    addressDTO.getCity(),
                    addressDTO.getDistrict(),
                    addressDTO.getPostalCode(),
                    customerDTO.getName(),
                    rentalDTO.getGetDate(),
                    rentalDTO.getRecieveDate(),
                    rentalDTO.getPrice()



            );
        }
        return null;
    }
    /*  private String rentalId;
    private String carOwnerNIC;
    private String customerNIC;
    private LocalDateTime paymentDateTime;
    private double paymentPrice;*/

    private void completePayments(CarDTO carDTO, RentalDTO rentalDTO) {
        paymentService.registerPaymentService(carDTO,rentalDTO);


    }
}
