package com.easter.validator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author EasterFan working on 2020/9/26 8:01 下午
 * @Description
 * @Version 1.0
 */
@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface Password {
    String message() default "Invalid password format";
    Class[] groups() default {};
    Class[] payload() default {};
}
