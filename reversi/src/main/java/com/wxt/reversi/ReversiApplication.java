package com.wxt.reversi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wxt.reversi.dao")
@SpringBootApplication
public class ReversiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReversiApplication.class, args);
    }

}
