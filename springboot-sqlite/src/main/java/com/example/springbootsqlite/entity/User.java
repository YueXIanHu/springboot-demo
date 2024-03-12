package com.example.springbootsqlite.entity;

import lombok.Data;

/**
 * @author: YueXian
 * @date: 2024/3/11 11:50
 */
@Data
public class User {
    // 排序，默认升序
    private String uid;

    private String name;

    private Integer sex;

    private String email;

}