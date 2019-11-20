package com.huzh.springbootrabbitmq.sender;

import com.huzh.springbootrabbitmq.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName ObjectSender
 * @Description TODO
 * @Date 2019/11/20 16:51
 * @Author huzh
 * @Version 1.0
 */
@Component
public class ObjectSender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendUser(User user) {

        System.out.println("Send object:" + user.toString());
        this.amqpTemplate.convertAndSend("object_queue", user);

    }
}