package ecom.mlslsenarathna.repository;

import ecom.mlslsenarathna.mode.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
}
