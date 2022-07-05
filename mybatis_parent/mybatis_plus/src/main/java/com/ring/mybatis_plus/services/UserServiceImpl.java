package com.ring.mybatis_plus.services;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ring.mybatis_plus.entities.User;
import com.ring.mybatis_plus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        User user = baseMapper.selectById(id);
        return user;
    }
}
