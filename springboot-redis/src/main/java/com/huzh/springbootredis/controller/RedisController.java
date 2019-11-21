package com.huzh.springbootredis.controller;

import com.huzh.springbootredis.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RedisController
 * @Description TODO
 * @Date 2019/11/21 15:05
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class RedisController {

    @Resource
    RedisTemplate<String,Serializable>  redisTemplate;

//    @Autowired
//    private RedisTemplate redisTemplate;

    @RequestMapping("/set")
    public String HelloSpring(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return String.format("redis set成功！key=%s,value=%s", key, value);
    }

    @RequestMapping("/get")
    public String HelloSpring(String key) {
        String value = (String) redisTemplate.opsForValue().get(key);
        return "redis get结果 value=" + value;
    }

    @RequestMapping("/setUser")
    public String setUser() {
        User user = new User();
        user.setName("admin12");
        user.setAge(22);
        List<String> list = new ArrayList<>();
        list.add("小学");
        list.add("初中");
        list.add("高中");
        list.add("大学");
        user.setEducation(list);
        redisTemplate.opsForValue().set("userInfo", user);
        return "success";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        return (User) redisTemplate.opsForValue().get("userInfo");
    }
}
