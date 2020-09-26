package com.easter.validator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author EasterFan working on 2020/9/26 8:07 下午
 * @Description
 * @Version 1.0
 */
@Documented
@Constraint(validatedBy = UserNameValidator.class)
@Target({PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface UserName {
    String message() default "姓名格式错误";

    Class[] groups() default {};

    Class[] payload() default {};
}
