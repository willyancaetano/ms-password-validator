package com.github.willyancaetano.password.validator.api.controller;

import com.github.willyancaetano.password.validator.api.dto.PasswordRequestDTO;
import com.github.willyancaetano.password.validator.api.dto.StatusValidationResponseDTO;
import com.github.willyancaetano.password.validator.service.ValidatePasswordService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/passwords")
public class PasswordsController {

    private final ValidatePasswordService service;

    public PasswordsController(ValidatePasswordService service) {
        this.service = service;
    }

    @PostMapping("/validations")
    @ResponseStatus(HttpStatus.OK)
    public StatusValidationResponseDTO validatePassword(@RequestBody PasswordRequestDTO requestDTO) {
        return service.validatePassword(requestDTO);
    }
}
