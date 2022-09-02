package com.github.willyancaetano.password.validator.service;

import com.github.willyancaetano.password.validator.api.dto.PasswordRequestDTO;
import com.github.willyancaetano.password.validator.api.dto.StatusValidationResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidatePasswordService {

    private final List<PasswordValidator> validators;

    public ValidatePasswordService(List<PasswordValidator> validators) {
        this.validators = validators;
    }

    public StatusValidationResponseDTO validatePassword(PasswordRequestDTO requestDTO) {
        boolean isValid = validators.stream()
                .allMatch(validator -> validator.validate(requestDTO.value()));

        return new StatusValidationResponseDTO(isValid);
    }
}
