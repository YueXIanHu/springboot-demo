package com.huzh.springbootmongodb.controller;

import com.huzh.springbootmongodb.entity.User;
import com.huzh.springbootmongodb.repositiry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/11/22 10:51
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("save")
    public String save() {
        User user = new User(System.currentTimeMillis(), "用户" + System.currentTimeMillis(), "123");
        userRepository.save(user);
        return "success";
    }


    @GetMapping("getUserList")
    public List<User> getUserList() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @GetMapping("delete")
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "success";
    }

    @GetMapping("update")
    public String update(Long id, String username, String password) {
        User user = new User(id, username, password);
        userRepository.save(user);
        return "success";
    }
}
