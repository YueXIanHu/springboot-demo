package com.huzh.springbootjwt.controller;

import com.huzh.springbootjwt.entity.User;
import com.huzh.springbootjwt.service.AuthorizationService;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
public class AccountController {

    @Autowired
    AuthorizationService authorizationService;

    //用一个hashmap存储注册用户，演示用
    private static HashMap<String,User> accountUserMap = new HashMap<>();

    //注册
    @GetMapping("/register")
    public String register(@RequestParam(name = "account") String account,
                           @RequestParam(name = "password") String password){
        JSONObject ret = new JSONObject();
        //简单校验下非空
        if(account == null || account.equals("") || password == null || password.equals("")){
            ret.put("code","1");
            ret.put("desc","account | password can not empty");
            return ret.toString();
        }

        //注册成功
        accountUserMap.put(account,new User(account,password));

        ret.put("code","0");
        ret.put("desc","ok");
        return ret.toString();
    }

    //登录
    @GetMapping("/login")
    public String login(@RequestParam(name = "account") String account,
                        @RequestParam(name = "password") String password){
        JSONObject ret = new JSONObject();
        User user = accountUserMap.get(account);
        if(user != null && password != null && password.equals(user.getPassword())){
            //登录成功
            //创建token
            String token = authorizationService.createToken(account);

            //更新用户最近登录时间
            user.setLastLoginTime(new Date().toLocaleString());
            accountUserMap.put(account,user);

            ret.put("code","0");
            ret.put("desc","ok");
            ret.put("token",token);
            return ret.toString();
        }
        ret.put("code","1");
        ret.put("desc","failed");
        return ret.toString();
    }

    //查询用户信息
    @GetMapping("/user")
    public String queryUser(@RequestParam(name = "token") String token){
        JSONObject ret = new JSONObject();
        //识别token
        try {
            String account = authorizationService.verifyToken(token);
            if(account != null) {
                System.out.println();
                ret.put("code","0");
                ret.put("desc","ok" );
                ret.put("user",accountUserMap.get(account).toString());
                return ret.toString();
            }else {
                //正常情况，token认证失败基本都是token过期，其他错误信息在上线前就调试正常了
                //token刷新问题，后面博文再做介绍
                ret.put("code","2");
                ret.put("desc","token认证失败，请刷新token");
                return ret.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ret.put("code","1");
        ret.put("desc","failed");
        return ret.toString();
    }
}
