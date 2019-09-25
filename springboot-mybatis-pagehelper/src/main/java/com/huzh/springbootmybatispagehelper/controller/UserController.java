package com.huzh.springbootmybatispagehelper.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huzh.springbootmybatispagehelper.dao.UserMapper;
import com.huzh.springbootmybatispagehelper.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/9/25 16:10
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

//    http://localhost:8080/getUserList?pageNum=1&pageSize=2
    @RequestMapping("getUserList")
    public Page<User> getUserList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<User> userList = userMapper.getUserList();
        return userList;
    }
}
