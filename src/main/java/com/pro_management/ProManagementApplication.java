package com.pro_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.pro_management.mapper")
public class ProManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProManagementApplication.class, args);
    }

}
