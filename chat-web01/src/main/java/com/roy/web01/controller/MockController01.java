package com.roy.web01.controller;

import com.roy.chat.impl.TestServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 21:01 2023/3/3
 */
@RestController
public class MockController01 {

    @GetMapping("/web01")
    public String hello(){
        TestServiceImpl testService = new TestServiceImpl();
        testService.testServiceFunction();
        System.out.println("hello");
        return "hello web01";
    }
}
