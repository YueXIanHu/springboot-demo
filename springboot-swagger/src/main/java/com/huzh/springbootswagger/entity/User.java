package com.huzh.springbootswagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/8/29 16:56
 * @Author huzh
 * @Version 1.0
 */
@Entity
@ApiModel(description = "用户实体")
public class User {

    @ApiModelProperty(value = "主键id", hidden = true)
    @GeneratedValue
    @Id
    Integer id;

    @ApiModelProperty(value = "用户名称")
    @NotNull
    @Column
    private String username;

    @ApiModelProperty(value = "用户密码")
    @Column
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public User() {
    }

    public User(Integer id, @NotNull String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(@NotNull String username, String password) {
        this.username = username;
        this.password = password;
    }
}
