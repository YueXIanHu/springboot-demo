package com.huzh.springbootaop.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @ClassName DoneTime
 * @Description TODO
 * @Date 2019/8/6 16:53
 * @Author huzh
 * @Version 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface DoneTime {
    String param() default "";
}
