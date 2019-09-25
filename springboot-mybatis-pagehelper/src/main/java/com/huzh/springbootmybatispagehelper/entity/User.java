package com.huzh.springbootmybatispagehelper.entity;

import org.apache.ibatis.type.Alias;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/9/25 16:05
 * @Author huzh
 * @Version 1.0
 */
@Alias("user")
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
