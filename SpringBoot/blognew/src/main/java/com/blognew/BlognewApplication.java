package com.blognew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.blognew.mapper")
public class BlognewApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlognewApplication.class, args);
    }

}
