package com.huzh.springbootredis.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/11/21 15:16
 * @Author huzh
 * @Version 1.0
 */
public class User implements Serializable {
    private String name;
    private int age;
    private List<String> education;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getEducation() {
        return education;
    }

    public void setEducation(List<String> education) {
        this.education = education;
    }
}
