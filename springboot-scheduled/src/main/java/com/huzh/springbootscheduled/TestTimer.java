package com.huzh.springbootscheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName TestTimer
 * @Description TODO
 * @Date 2019/8/2 10:47
 * @Author huzh
 * @Version 1.0
 */
@Component
public class TestTimer {

    @Scheduled(cron = "0/1 * * * * ?")
    private void test() {
        System.out.println("执行定时任务的时间是" + new Date());
    }
}
