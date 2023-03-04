package com.roy.chat.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roy.chat.dao.UserMapper;
import com.roy.chat.entity.User;
import com.roy.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 00:56 2023/3/4
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }



    @Override
    public List<User> getUserList() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        //List<User> userList = userMapper.selectList(userQueryWrapper);
        List<User> userList = userMapper.selectALLUser();
        System.out.println("service.........");
        return userList;
    }
}
