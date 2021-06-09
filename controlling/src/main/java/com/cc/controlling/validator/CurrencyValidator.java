package com.cc.controlling.validator;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CurrencyValidator implements ConstraintValidator<Currency, BigDecimal> {

    @Override
    public void initialize(Currency currency) {
    }

    @Override
    public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
	// TODO Implement logic
	return false;
    }

}
