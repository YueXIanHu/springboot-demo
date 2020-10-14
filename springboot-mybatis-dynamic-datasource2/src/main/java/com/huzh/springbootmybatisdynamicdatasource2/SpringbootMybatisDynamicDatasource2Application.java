package com.huzh.springbootmybatisdynamicdatasource2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huzh.springbootmybatisdynamicdatasource2.dao")
public class SpringbootMybatisDynamicDatasource2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDynamicDatasource2Application.class, args);
    }

}
