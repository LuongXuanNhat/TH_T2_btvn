package com.example.th_t2_btvn.Validator;

import com.example.th_t2_btvn.Validator.annotation.ValidCategoryId;
import com.example.th_t2_btvn.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}

