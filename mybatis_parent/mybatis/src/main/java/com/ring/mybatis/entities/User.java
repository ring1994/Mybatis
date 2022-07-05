package com.ring.mybatis.entities;

import lombok.Data;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 19:39
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String birthday;
}
