package com.huzh.springbootmybatismapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 注意：这里的 MapperScan 是 tk.mybatis.spring.annotation.MapperScan 这个包下的
@MapperScan(basePackages = "com.huzh.springbootmybatismapper.mapper")
public class SpringbootMybatisMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisMapperApplication.class, args);
    }

}
