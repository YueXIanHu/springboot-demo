package com.huzh.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName FanoutReceiverB
 * @Description TODO
 * @Date 2019/11/20 17:09
 * @Author huzh
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {


    @RabbitHandler
    public void process(String message){

        System.out.println("Receiver form fanout.B: "+message);

    }

}