package com.huzh.springbootthymeleaf.responsibilitytree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author huzh
 * @Description TODO
 * @Date 2021.4.6 17:30
 * @Created by huzh
 */
@Controller
public class TestException {

    @Resource
    private Root root;

    @GetMapping("/testStrategy")
    @ResponseBody
    public void test(){
        //root节点中传入参数获取A的处理策略
        root.applyStrategy("A");

    }

}
