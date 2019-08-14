package com.huzh.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description TODO
 * @Date 2019/8/8 15:10
 * @Author huzh
 * @Version 1.0
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String testThymeleaf(Model model) {
        model.addAttribute("msg", "Hello, this is thymeleaf");
        return "thymeleaf";
    }
}
