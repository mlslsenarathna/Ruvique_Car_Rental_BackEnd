package ecom.mlslsenarathna.repository;

import ecom.mlslsenarathna.mode.entity.CarOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOwnerRepository extends JpaRepository<CarOwnerEntity,Integer> {
    CarOwnerEntity findTopByOrderByOwnerIdDesc();

}
