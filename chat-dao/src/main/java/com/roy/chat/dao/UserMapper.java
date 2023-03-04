package com.roy.chat.dao;

import com.roy.chat.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author dingyawu
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-03-04 01:27:30
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {


    List<User> selectALLUser();

}




