package com.lyliu.java.bookmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyliu.java.bookmanager.mapper")
public class BookmanagerApplication {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(BookmanagerApplication.class, args);
    }

}
