package com.huzh.springbootrabbitmq.receiver;

import com.huzh.springbootrabbitmq.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName ObjectReceiver
 * @Description TODO
 * @Date 2019/11/20 16:51
 * @Author huzh
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "object_queue")
public class ObjectReceiver {

    @RabbitHandler
    public void objectReceiver(User user) {

        System.out.println("Receiver object:" + user.toString());
    }
}
