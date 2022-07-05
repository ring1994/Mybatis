package com.ring.mybatis.services;

import com.ring.mybatis.entities.User;
import com.ring.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User getUserById(int idq) {
        User user = userMapper.selectUserById(idq);
        return user;
    }

    @Override
    public User getUserByAge(int age) {
        return userMapper.selectUserByAge(age);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }
}
