package com.huzh.springbootaop.aspect;

import com.huzh.springbootaop.annotation.DoneTime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName DoneTimeAspect
 * @Description TODO
 * @Date 2019/8/6 16:57
 * @Author huzh
 * @Version 1.0
 */
@Aspect
@Component
public class DoneTimeAspect {

    //@annotation 这个你应当知道指的是匹配注解
    //括号中的 doneTime 并不是指所有自定标签，而是指在你的注释实现类中 *Aspect 中对应注解对象的别名，所以别被俩 annotation  所迷惑。
    @Around("@annotation(doneTime)")
    public Object around(ProceedingJoinPoint joinPoint, DoneTime doneTime) throws Throwable {
        System.out.println("方法开始时间是:" + new Date());
        Object o = joinPoint.proceed();
        doneTime.param();
        System.out.println("方法结束时间是:" + new Date());
        return o;
    }
}
