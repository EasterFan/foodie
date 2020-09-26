package com.easter.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author EasterFan working on 2020/9/26 8:07 下午
 * @Description
 * @Version 1.0
 */
public class UserNameValidator implements ConstraintValidator<UserName, String> {
   @Override
   public boolean isValid(String userName, ConstraintValidatorContext context) {
      if (userName == null) {
         // cannot be null
         return false;
      }
      //  2 - 15 位字母 / 数字 / 简繁体字
      String regExp = "(?!.*\\s$)((?=\\S)(?![0-9]+$)[\\u4E00-\\u9FA5A-Za-z0-9. ' ]{2,15})";
      return userName.matches(regExp);
   }
}
