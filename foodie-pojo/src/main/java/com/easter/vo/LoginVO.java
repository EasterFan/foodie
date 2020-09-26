package com.easter.vo;

import com.easter.validator.Password;
import com.easter.validator.UserName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author EasterFan working on 2020/9/26 11:22 下午
 * @Description
 * @Version 1.0
 */
@ApiModel(value = "登录", description = "用户登录")
@Data
public class LoginVO {
    @ApiModelProperty(value = "用户名", name = "username", example = "easter")
    @UserName
    private String username;

    @ApiModelProperty(value = "密码", name = "password", example = "123456")
    @Password
    private String password;
}
