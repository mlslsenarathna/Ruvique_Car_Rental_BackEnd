package ecom.mlslsenarathna.mode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "carOwner")
public class CarOwnerEntity {

    private int ownerId;
    private String name;
    private String email;
    @Id
    private String nic;
    private String phone;
    private String photoURL;


}
