package com.huzh.springbootlogback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController2
 * @Description TODO
 * @Date 2019/10/14 15:46
 * @Author huzh
 * @Version 1.0
 */
@RestController
@Slf4j
public class IndexController2 {

    @RequestMapping("/index2")
    public String index2() {
        log.trace("记录trace日志");
        log.debug("记录debug日志");
        log.info("访问了index方法");
        log.warn("记录了warn日志");
        log.error("记录了error错误日志");

        try {
            int i = 0;
            int j = 1 / i;
        } catch (Exception e) {
            log.error("错误异常：", e);
        }
        return "index";
    }
}
