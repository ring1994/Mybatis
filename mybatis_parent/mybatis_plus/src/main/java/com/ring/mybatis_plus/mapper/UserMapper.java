package com.ring.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ring.mybatis_plus.entities.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
