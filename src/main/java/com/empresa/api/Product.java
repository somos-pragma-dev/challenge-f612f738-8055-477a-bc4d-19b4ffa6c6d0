package com.empresa.api;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductValidator implements ConstraintValidator<ProductConstraint, Product> {
    @Override
    public boolean isValid(Product product, ConstraintValidatorContext context) {
        // Custom validation logic
        return true;
    }
}