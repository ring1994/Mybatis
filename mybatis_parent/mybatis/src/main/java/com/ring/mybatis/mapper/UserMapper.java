package com.ring.mybatis.mapper;

import com.ring.mybatis.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:21
 */
@Mapper
public interface UserMapper {
    /**
     * 插入一个用户
     *
     * @param user
     */
    void insertUser(@Param("user") User user);

    /**
     * 获取所有用户
     *
     * @return
     */
    List<User> selectAllUser();

    /**
     * 根据id查找用户
     *
     * @param idq
     * @return @Param("idq")
     */
    User selectUserById(@Param("idq") Integer idq);

    User selectUserByAge(@Param("age") Integer age);
}
