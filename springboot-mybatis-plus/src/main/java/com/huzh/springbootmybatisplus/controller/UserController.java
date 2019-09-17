package com.huzh.springbootmybatisplus.controller;

import com.huzh.springbootmybatisplus.entity.User;
import com.huzh.springbootmybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/9/4 12:11
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<User> list() {
        return userMapper.selectList(null);
    }
}
