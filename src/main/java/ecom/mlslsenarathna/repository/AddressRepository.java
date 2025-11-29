package ecom.mlslsenarathna.repository;

import ecom.mlslsenarathna.mode.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,String> {
}
