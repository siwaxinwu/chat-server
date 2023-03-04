package com.roy.web01.controller;

import com.roy.chat.entity.User;
import com.roy.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 21:01 2023/3/3
 */
@RestController
public class MockController01 {



    private UserService userService;

    @Autowired
    public void setStudentService(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/web01")
    public List<User> queryUser(){
        return userService.getUserList();
    }
}
