package com.huzh.springbootmybatisdynamicdatasource2.controller;


import com.huzh.springbootmybatisdynamicdatasource2.service.UserService;
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

    @PostMapping(value = "/findAll")
    public Object findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/findAll2")
    public Object findAll2() {
        return userService.findAll2();
    }
}
