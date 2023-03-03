package com.roy.web02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 21:03 2023/3/3
 */
@RestController
public class MockController02 {

    @GetMapping("/web02")
    public String hello(){
        System.out.println("hello");
        return "hello web02";
    }
}
