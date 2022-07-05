package com.ring.mybatis_plus.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ring.mybatis_plus.entities.User;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:27
 */
public interface UserService extends IService<User> {

    User getUserById(int id);
}
