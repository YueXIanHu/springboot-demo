package com.huzh.springbootaop.controller;

import com.huzh.springbootaop.annotation.DoneTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Date 2019/8/6 17:06
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    @DoneTime(param = "IndexController")
    public String index() {
        System.out.println("方法执行");
        return "hello dalaoyang";
    }

    @GetMapping("/index2")
    public String index2() {
        System.out.println("方法2执行");
        return "hello dalaoyang";
    }
}
