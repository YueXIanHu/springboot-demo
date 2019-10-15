package com.huzh.springbootlog4j2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController2
 * @Description TODO
 * @Date 2019/10/15 9:13
 * @Author huzh
 * @Version 1.0
 */
@RestController
@Log4j2
public class IndexController2 {

    @RequestMapping("/index2")
    public String index2() {

        log.debug("记录debug日志");
        log.info("访问了index方法");
        log.warn("访问了warn方法");
        log.error("记录了error错误日志");
        log.fatal("访问了fatal方法");

        try {
            int i = 0;
            int j = 1 / i;
        } catch (Exception e) {
            log.error("错误异常：", e);
        }
        return "index2";
    }

}
