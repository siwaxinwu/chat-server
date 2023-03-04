package com.roy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.roy.chat.dao")
public class EntranceAPP {
    public static void main( String[] args ) {
        SpringApplication.run(EntranceAPP.class, args);
    }
}
