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
    public String selectAll() {
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println("================>" + user);

        List<User> userList = userMapper.selectAll();
        System.out.println("================>" + userList);

        //使用对象传参，适用于1个字段或者多个字段联合主键使用
        User user1 = new User();
        user1.setId(1);
        User user2 = userMapper.selectByPrimaryKey(user1);
        System.out.println("================>" + user2);

        return "success";
    }
}
