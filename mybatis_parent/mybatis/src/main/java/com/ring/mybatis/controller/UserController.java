package com.ring.mybatis.controller;

import com.ring.mybatis.entities.User;
import com.ring.mybatis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 爱鑫一击
 * @Date 2022/5/22 20:31
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("all")
    @ResponseBody
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("id")
    @ResponseBody
    public User getUserById(@RequestParam int id) {
        User userById = userService.getUserById(id);
        return userById;
    }

    @GetMapping("age")
    @ResponseBody
    public User getUserByAge(@RequestParam int age) {
        return userService.getUserByAge(age);
    }

    @PostMapping("add")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        System.out.println(user);
        userService.addUser(user);
    }
}
