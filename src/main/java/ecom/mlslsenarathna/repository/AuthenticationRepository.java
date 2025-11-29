package ecom.mlslsenarathna.repository;

import ecom.mlslsenarathna.mode.entity.AuthenticationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<AuthenticationEntity,String> {
}
