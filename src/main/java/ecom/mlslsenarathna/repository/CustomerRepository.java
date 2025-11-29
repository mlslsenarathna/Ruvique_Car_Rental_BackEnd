package ecom.mlslsenarathna.repository;

import ecom.mlslsenarathna.mode.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
    CustomerEntity findByPhone(String phone);

    CustomerEntity findByEmail(String email);
    CustomerEntity findTopByOrderByCustomerIdDesc();
}
