package com.huzh.springbootspringdoc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huzh
 * @description
 * @date 2022/10/28 20:48
 */
@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

}
