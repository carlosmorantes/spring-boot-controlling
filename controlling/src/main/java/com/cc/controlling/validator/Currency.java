package com.cc.controlling.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target({ ElementType.FIELD }) // The @Target annotation describes where you can apply your custom annotation
@Retention(RetentionPolicy.RUNTIME) // The @Retention annotation describes if the custom annotation should be
				    // available in the byte code. If so, Java can read it with the reflection
				    // mechanism.
@Constraint(validatedBy = { CurrencyValidator.class }) // We use it to declare a class that will contain actual
						       // validation logic
public @interface Currency {

    String message() default "{com.cc.controlling.validator.currency.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
