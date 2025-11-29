package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.service.PasswordService;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {

    public String hashPassword(String plainPassword) {

        String salt = BCrypt.gensalt(10);
        return BCrypt.hashpw(plainPassword, salt);
    }
    public boolean checkPassword(String plainPassword, String storedHash) {

        return BCrypt.checkpw(plainPassword, storedHash);
    }


}
