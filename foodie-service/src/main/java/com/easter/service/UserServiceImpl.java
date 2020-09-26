package com.easter.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easter.mapper.UsersMapper;
import com.easter.po.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Author EasterFan working on 2020/9/26 6:44 下午
 * @Description
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements UserService {
    @Resource
    UsersMapper usersMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean isUserNameExist(String username) {
        Map<String, Object> map = new HashMap<String, Object>(1) {{
            put("username", username);
        }};

        List<Users> userList = usersMapper.selectByMap(map);

        return userList.size() != 0;
    }
}
