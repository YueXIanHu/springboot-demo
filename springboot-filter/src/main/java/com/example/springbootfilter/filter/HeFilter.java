package com.example.springbootfilter.filter;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author: YueXian
 * @date: 2024/3/8 11:07
 */
public class HeFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("您已进入filter过滤器，您的请求正常，请继续遵规则...");
        chain.doFilter(request, response);
    }
}