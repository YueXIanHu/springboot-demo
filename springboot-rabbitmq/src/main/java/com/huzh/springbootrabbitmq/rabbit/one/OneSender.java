package com.huzh.springbootrabbitmq.rabbit.one;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Sender
 * @Description TODO
 * @Date 2019/11/21 17:09
 * @Author huzh
 * @Version 1.0
 */
@Component
public class OneSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i) {
        String context = "spirng boot OTM queue"+" ****** "+i;
        System.out.println("Sender1" + context);
        this.amqpTemplate.convertAndSend("OTM", context);
    }
}
