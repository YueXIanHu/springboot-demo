package com.huzh.springbootmybatisdynamicdatasource.controller;

import com.huzh.springbootmybatisdynamicdatasource.common.annotation.DataSource;
import com.huzh.springbootmybatisdynamicdatasource.common.enums.DataSourceType;
import com.huzh.springbootmybatisdynamicdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huzh
 * @date 2020/10/12 16:00
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;


    @DataSource(value = DataSourceType.MASTER)
    @PostMapping(value = "/findAll")
    public Object findAll() {
        return userService.findAll();
    }

    @DataSource(value = DataSourceType.SLAVE)
    @PostMapping(value = "/findAll2")
    public Object findAll2() {
        return userService.findAll();
    }
}
