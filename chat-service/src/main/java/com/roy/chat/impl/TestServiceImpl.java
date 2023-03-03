package com.roy.chat.impl;

import com.roy.chat.TestDao;
import com.roy.chat.TestService;
import com.roy.chat.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 23:45 2023/3/3
 */
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void testServiceFunction() {
        //testDao.testDaoFunction();
        System.out.println("i am method of service");
        TestUtils.testA();

    }
}
