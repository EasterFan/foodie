package com.easter.vo;

import com.easter.validator.Password;
import com.easter.validator.UserName;
import lombok.Data;

/**
 * @Author EasterFan working on 2020/9/26 7:51 下午
 * @Description
 * @Version 1.0
 */
@Data
public class RegisterVO {

    @UserName
    private String username;

    @Password
    private String password;

    @Password
    private String confirmPassword;

}
