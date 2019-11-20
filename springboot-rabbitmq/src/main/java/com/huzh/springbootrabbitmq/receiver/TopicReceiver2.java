package com.huzh.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TopicReceiver2
 * @Description TODO
 * @Date 2019/11/20 16:56
 * @Author huzh
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {

    @RabbitHandler
    public void process(String message){

        System.out.println("Receiver topic.messages: "+ message);

    }

}