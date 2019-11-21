package com.huzh.springbootrabbitmq.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName Sender
 * @Description TODO
 * @Date 2019/11/20 14:47
 * @Author huzh
 * @Version 1.0
 */
@Component
public class ManySender1 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i) {
        String context = i + "";
        System.out.println("Sender1: " + context + "--send:");
        amqpTemplate.convertAndSend("manyQueue", context);
    }
}