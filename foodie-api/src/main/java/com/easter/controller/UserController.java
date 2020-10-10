package com.easter.controller;

import com.easter.api.CommonResult;
import com.easter.po.Users;
import com.easter.service.UserService;
import com.easter.vo.LoginVO;
import com.easter.vo.RegisterVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import static com.easter.exception.ErrorCode.USER_ALREADY_EXIST;

/**
 * @Author EasterFan working on 2020/9/19 10:04 下午
 * @Description
 * @Version 1.0
 */
@Api(value = "注册登录", tags = {"用于注册登录的相关接口"})
@RestController
@RequestMapping("passport")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "查询用户名是否存在", notes = "查询用户名是否存在", httpMethod = "GET")
    @GetMapping("/isUserNameExist")
    public CommonResult<Boolean> isUsernameExist(@RequestParam @Valid @NotEmpty String username) {
        boolean isUserExist = userService.isUserNameExist(username);
        return isUserExist ? CommonResult.failed(USER_ALREADY_EXIST, true) : CommonResult.success(false);
    }

    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("/register")
    public CommonResult<Users> register(@RequestBody @Valid RegisterVO registerVO) throws Exception {
        return CommonResult.success(userService.register(registerVO));
    }

    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping("/login")
    public CommonResult<Users> login(@RequestBody @Valid LoginVO loginVO) throws Exception {
        return CommonResult.success(userService.login(loginVO));
    }

}
