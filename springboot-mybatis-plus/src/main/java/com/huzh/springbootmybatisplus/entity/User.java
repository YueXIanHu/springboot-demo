package com.huzh.springbootmybatisplus.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/9/4 12:09
 * @Author huzh
 * @Version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}