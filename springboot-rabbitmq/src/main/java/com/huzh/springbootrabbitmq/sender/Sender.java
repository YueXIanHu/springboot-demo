package com.huzh.springbootrabbitmq.sender;

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
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "简单消息发送" + new Date();
        System.out.println("send: " + context);
        amqpTemplate.convertAndSend("message", context);
    }


    public void send2(int i){
        String context = i+"";
        System.out.println(context+"--send:");
        amqpTemplate.convertAndSend("message2",context);
    }
}