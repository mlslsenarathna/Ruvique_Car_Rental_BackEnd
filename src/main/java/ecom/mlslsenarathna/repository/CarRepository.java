package ecom.mlslsenarathna.repository;

import ecom.mlslsenarathna.mode.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,String> {
}
