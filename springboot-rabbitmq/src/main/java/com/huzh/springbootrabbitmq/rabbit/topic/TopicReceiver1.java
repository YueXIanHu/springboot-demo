package com.huzh.springbootrabbitmq.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TopicReceiver1
 * @Description TODO
 * @Date 2019/11/20 16:56
 * @Author huzh
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver1 {

    @RabbitHandler
    public void process(String message){

        System.out.println("Receiver topic.message :"+ message);

    }

}
