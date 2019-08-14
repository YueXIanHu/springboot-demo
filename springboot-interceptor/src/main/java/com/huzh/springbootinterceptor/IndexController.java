package com.huzh.springbootinterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Date 2019/8/2 16:54
 * @Author huzh
 * @Version 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("content", "hi , 企鹅十五号 !");
        return "index";
    }
}
