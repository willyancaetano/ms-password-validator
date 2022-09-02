package com.github.willyancaetano.password.validator.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class ValidateHasSpecialCharacter implements PasswordValidator {

    @Override
    public boolean validate(String value) {
        return StringUtils.containsAny(value, '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
    }
}
