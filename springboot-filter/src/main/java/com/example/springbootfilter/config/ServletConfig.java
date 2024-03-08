package com.example.springbootfilter.config;

import com.example.springbootfilter.filter.HeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: YueXian
 * @date: 2024/3/8 11:09
 */
@Configuration
public class ServletConfig {

    @Bean
    public FilterRegistrationBean heFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new HeFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }
}