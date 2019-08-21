package com.huzh.springbootmybatis.entity;

import org.apache.ibatis.type.Alias;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/8/21 12:14
 * @Author huzh
 * @Version 1.0
 */
@Alias("User")
public class User {

    private int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
