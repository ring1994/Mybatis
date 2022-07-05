package com.ring.mybatis_plus.controller;

import com.ring.mybatis_plus.entities.User;
import com.ring.mybatis_plus.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:31
 */
@Controller
@RequestMapping("user")
@AllArgsConstructor
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("id")
    @ResponseBody
    public User getUserById(@RequestParam int id) {
        User userById = userService.getUserById(id);
        return userById;
    }
}
