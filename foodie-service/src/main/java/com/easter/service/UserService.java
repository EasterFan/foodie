package com.easter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.easter.po.Users;

/**
 * @Author EasterFan working on 2020/9/26 6:43 下午
 * @Description
 * @Version 1.0
 */
public interface UserService extends IService<Users> {
    boolean isUserNameExist(String username);
}
