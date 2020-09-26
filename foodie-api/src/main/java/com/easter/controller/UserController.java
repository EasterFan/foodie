package com.easter.controller;

import com.easter.po.Users;
import com.easter.service.UserService;
import com.easter.vo.RegisterVO;
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
@RestController
@RequestMapping("passport")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/isUserNameExist")
    public ResponseEntity<Boolean> isUsernameExist(@RequestParam @Valid @NotEmpty String username) {
        return ResponseEntity.ok().body(userService.isUserNameExist(username));
    }

    @PostMapping("/register")
    public ResponseEntity<Users> register(@RequestBody @Valid RegisterVO registerVO) {
        return ResponseEntity.ok().body(userService.register(registerVO));
    }

}
