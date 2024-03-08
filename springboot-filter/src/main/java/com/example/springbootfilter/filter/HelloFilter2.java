package com.example.springbootfilter.filter;

/**
 * @author: YueXian
 * @date: 2024/3/8 11:09
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
@Component
// filterName就是当前类名称，还有一个urlPattens的参数，这个参数表示要过滤的URL上的后缀名，是多参数，可以用数组表示。
@WebFilter(value = "/hello")  //或(filterName = "f1", urlPatterns = {"*.html","*.jsp","/hello"})
public class HelloFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        log.info("进入到过滤器2啦");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
