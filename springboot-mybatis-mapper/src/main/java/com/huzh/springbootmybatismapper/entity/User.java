package com.huzh.springbootmybatismapper.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

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

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    @Transient
    private String otherThings; //非数据库表中字段
}