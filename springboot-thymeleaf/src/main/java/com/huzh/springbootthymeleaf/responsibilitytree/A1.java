package com.huzh.springbootthymeleaf.responsibilitytree;

import org.springframework.stereotype.Component;

/**
 * @author huzh
 * @date 2021.3.30 19:26
 */
@Component
public class A1 implements StrategyHandler<String, Boolean> {

    @Override
    public Boolean apply(String param) {
        System.out.println("A1开始执行");
        System.out.println("A1开始完毕");
        return true;
    }
}
