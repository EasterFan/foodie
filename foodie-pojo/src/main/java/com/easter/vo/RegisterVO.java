package com.easter.vo;

import com.easter.validator.Password;
import com.easter.validator.UserName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author EasterFan working on 2020/9/26 7:51 下午
 * @Description
 * @Version 1.0
 */
@ApiModel(value = "用户对象", description = "客户端用户传入的数据")
@Data
public class RegisterVO {

    @ApiModelProperty(value = "用户名", name = "username", example = "easter")
    @UserName
    private String username;

    @ApiModelProperty(value = "密码", name = "password", example = "123456")
    @Password
    private String password;

    @ApiModelProperty(value = "确认密码", name = "confirmPassword", example = "123456")
    @Password
    private String confirmPassword;

}
