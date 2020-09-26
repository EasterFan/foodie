package com.easter.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easter.constant.DefaultContants;
import com.easter.enums.Gender;
import com.easter.mapper.UsersMapper;
import com.easter.po.Users;
import com.easter.utils.MD5Utils;
import com.easter.vo.RegisterVO;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author EasterFan working on 2020/9/26 6:44 下午
 * @Description
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements UserService {
    @Resource
    UsersMapper usersMapper;

    // TODO - replace with mybatis-plus auto generate
    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
    @Override
    public boolean isUserNameExist(String username) {
        Map<String, Object> map = new HashMap<String, Object>(1) {{
            put("username", username);
        }};
        List<Users> userList = usersMapper.selectByMap(map);
        return userList.size() != 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public Users register(RegisterVO registerVO) {
        // TODO global exception
        String encryptPassword = null;
        try {
            encryptPassword = MD5Utils.getMD5Str(registerVO.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (isUserNameExist(registerVO.getUsername())){
            throw new RuntimeException("user already exist!");
        }

        Users user = Users.builder()
                .username(registerVO.getUsername())
                .nickname(registerVO.getUsername())
                .face((DefaultContants.DEFAULT_FACE))
                .birthday(LocalDate.parse(DefaultContants.DEFAULT_BIRTHDAY))
                .password(encryptPassword)
                .sex(Gender.SECRET.type)
                .id(sid.nextShort())
                .build();

        usersMapper.insert(user);

        return user;
    }
}
