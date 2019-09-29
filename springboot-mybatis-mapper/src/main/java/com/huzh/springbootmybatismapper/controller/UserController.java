package com.huzh.springbootmybatismapper.controller;

import com.huzh.springbootmybatismapper.entity.User;
import com.huzh.springbootmybatismapper.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/9/29 17:23
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userMapper.selectAll();
    }
}
