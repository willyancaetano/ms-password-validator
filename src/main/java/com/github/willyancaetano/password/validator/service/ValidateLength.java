package com.github.willyancaetano.password.validator.service;

import org.springframework.stereotype.Component;

@Component
public class ValidateLength implements PasswordValidator {

    @Override
    public boolean validate(String value) {
        return value.length() >= 9;
    }
}
