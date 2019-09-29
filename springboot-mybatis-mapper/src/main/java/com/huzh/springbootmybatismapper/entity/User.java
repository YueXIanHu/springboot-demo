package com.huzh.springbootmybatismapper.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/9/29 16:25
 * @Author huzh
 * @Version 1.0
 */
@Entity
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
}