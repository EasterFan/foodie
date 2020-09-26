package com.easter.controller;

import com.easter.po.Users;
import com.easter.service.UserService;
import com.easter.vo.RegisterVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

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
    public ResponseEntity<Boolean> isUsernameExist(@RequestParam @Valid @NotEmpty String username) {
        return ResponseEntity.ok().body(userService.isUserNameExist(username));
    }

    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("/register")
    public ResponseEntity<Users> register(@RequestBody @Valid RegisterVO registerVO) {
        return ResponseEntity.ok().body(userService.register(registerVO));
    }

}
