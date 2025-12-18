package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.mode.dto.AuthenticationDTO;
import ecom.mlslsenarathna.mode.dto.LogInResponseDTO;
import ecom.mlslsenarathna.mode.entity.AuthenticationEntity;
import ecom.mlslsenarathna.repository.AuthenticationRepository;
import ecom.mlslsenarathna.service.AuthenticationService;
import ecom.mlslsenarathna.service.PasswordService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    final AuthenticationRepository authenticationRepository;
    final PasswordService passwordService;
    ModelMapper mapper=new ModelMapper();
    @Override
    public void setAuthentication(AuthenticationDTO authenticationDTO) {
        authenticationDTO.setPassword(passwordService.hashPassword(authenticationDTO.getPassword()));
        authenticationRepository.save(mapper.map(authenticationDTO,AuthenticationEntity.class));
    }

    @Override
    public LogInResponseDTO validateLogin(String nic, String plainPassword) {

        AuthenticationEntity auth = authenticationRepository.findById(nic).orElse(null);

        if (auth == null) {
            return new LogInResponseDTO("FAILED", "NIC not found", null, null);
        }

        boolean isMatch = passwordService.checkPassword(plainPassword, auth.getPassword());

        if (!isMatch) {
            return new LogInResponseDTO("FAILED", "Invalid password", null, null);
        }
        return new LogInResponseDTO(
                "SUCCESS",
                "Login successful",
                auth.getRole(),
                auth.getNic()
        );
    }



}
