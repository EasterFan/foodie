package com.easter.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author EasterFan working on 2020/9/26 8:01 下午
 * @Description
 * @Version 1.0
 */
public class PasswordValidator implements ConstraintValidator<Password, String> {
   @Override
   public boolean isValid(String passwordField, ConstraintValidatorContext context) {
      if (passwordField == null) {
         // cannot be null
         return true;
      }
      //  5 - 15 位字母 / 数字 / 符号
      // ^ 匹配输入字符串开始的位置
      // $ 匹配输入字符串结尾的位置
      String regExp = "^[a-zA-Z0-9_-`-=;, ./~!@#$%^*()_+]{5,15}$";
      return passwordField.matches(regExp);
   }
}
