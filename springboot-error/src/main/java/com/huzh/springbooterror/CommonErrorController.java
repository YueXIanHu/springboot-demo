package com.huzh.springbooterror;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CommonErrorController
 * @Description TODO
 * @Date 2019/8/2 15:46
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class CommonErrorController implements ErrorController {

    private final String ERROR_PATH = "/error";

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @RequestMapping(value = ERROR_PATH)
    public String handleError() {
        System.out.println(getErrorPath());
        return "error";
    }
}
