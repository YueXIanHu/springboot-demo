package com.huzh.springbootrabbitmq.rabbit.one;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Receiver
 * @Description TODO
 * @Date 2019/11/20 14:55
 * @Author huzh
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "oneQueue")
public class OneReceiver2 {

    @RabbitHandler
    public void process(String Str) {
        System.out.println("Receiver2：" + Str);
    }
}
