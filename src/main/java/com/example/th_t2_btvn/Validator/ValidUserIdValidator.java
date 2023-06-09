package com.example.th_t2_btvn.Validator;

import com.example.th_t2_btvn.Validator.annotation.ValidUserId;
import com.example.th_t2_btvn.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public  boolean isValid(User user, ConstraintValidatorContext context){
        if (user == null) return  true;
        return  user.getId() != null;
    }
}
