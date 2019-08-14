package com.huzh.springbootinterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @ClassName CommonInterceptor
 * @Description TODO
 * @Date 2019/8/2 16:41
 * @Author huzh
 * @Version 1.0
 */
@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //preHandle在业务处理器处理请求之前被调用，
    //postHandle在业务处理器处理请求执行完成后,生成视图之前执行
    //afterCompletion在DispatcherServlet完全处理完请求后被调用
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        logger.info("请求ip：" + request.getRemoteAddr());
        logger.info("请求的方法：" + request.getMethod());
        ModelMap modelMap = modelAndView.getModelMap();
        modelMap.addAttribute("title", "test");
    }
}
