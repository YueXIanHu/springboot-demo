package com.huzh.springbooterror;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Date 2019/8/2 15:42
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String indesx() {
        return "index";
    }

    @RequestMapping("/test")
    public String test() {
        Map map = null;
        return map.toString();
    }
}
