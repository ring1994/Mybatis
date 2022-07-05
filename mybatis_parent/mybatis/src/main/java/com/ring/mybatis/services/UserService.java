package com.ring.mybatis.services;

import com.ring.mybatis.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:27
 */
public interface UserService {
    List<User> getAllUser();

    User getUserById(int idq);

    User getUserByAge(int age);

    void addUser(User user);
}
