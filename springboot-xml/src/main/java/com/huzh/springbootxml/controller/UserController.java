package com.huzh.springbootxml.controller;

import com.huzh.springbootxml.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/8/7 18:31
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class UserController {

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public User index() {
        User user = new User("xiaoming", "18", "beijing");
        return user;
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public User XML(){
        User user = new User("xiaoming", "18", "beijing");
        return user;
    }
}
