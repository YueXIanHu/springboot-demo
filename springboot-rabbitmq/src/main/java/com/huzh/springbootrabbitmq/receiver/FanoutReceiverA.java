package com.huzh.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName FanoutReceiverA
 * @Description TODO
 * @Date 2019/11/20 17:09
 * @Author huzh
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {


    @RabbitHandler
    public void process(String message){

        System.out.println("Receiver form fanout.A: "+message);

    }

}
