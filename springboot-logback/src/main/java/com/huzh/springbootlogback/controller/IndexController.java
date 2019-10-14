package com.huzh.springbootlogback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Date 2019/9/30 10:50
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class IndexController {

    // logback
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 访问首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        logger.trace("记录trace日志");
        logger.debug("记录debug日志");
        logger.info("访问了index方法");
        logger.warn("记录了warn日志");
        logger.error("记录了error错误日志");
        return "index";
    }
}
