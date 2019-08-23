package com.huzh.springbootmybatisannotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//或者直接在 Mapper 类上面添加注解@Mapper(过于麻烦,不建议)
@MapperScan("com.huzh.springbootmybatisannotation.mapper")
@SpringBootApplication
public class SpringbootMybatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisAnnotationApplication.class, args);
    }

}
