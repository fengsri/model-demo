package com.example.modeldemo.controller;

import com.example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/10/1 18:15
 * @Version V1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("get")
    public User getUser(){
        User user = new User();
        user.setId(10);
        user.setPassword("123456");
        user.setUsername("fengwen");
        return user;
    }

}
