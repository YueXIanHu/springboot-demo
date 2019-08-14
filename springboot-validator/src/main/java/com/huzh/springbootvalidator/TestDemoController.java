package com.huzh.springbootvalidator;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @ClassName TestDemoController
 * @Description TODO
 * @Date 2019/8/2 11:25
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class TestDemoController {

    @PostMapping("/")
    public String testDemo(@Valid Demo demo, BindingResult bindingResult) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bindingResult.hasErrors()) {
            List<ObjectError> list = bindingResult.getAllErrors();
            for (ObjectError objectError : list) {
                stringBuffer.append(objectError.getDefaultMessage());
                stringBuffer.append("---");
            }
        }
        return stringBuffer != null ? stringBuffer.toString() : "";
    }
}
