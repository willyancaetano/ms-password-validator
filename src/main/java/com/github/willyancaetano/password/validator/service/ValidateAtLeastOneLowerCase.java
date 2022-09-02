package com.github.willyancaetano.password.validator.service;

import org.springframework.stereotype.Component;

@Component
public class ValidateAtLeastOneLowerCase implements PasswordValidator {

    @Override
    public boolean validate(String value) {
        return value.chars().anyMatch(Character::isLowerCase);
    }
}
