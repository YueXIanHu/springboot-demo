package com.huzh.springbootrabbitmq.controller;

import com.huzh.springbootrabbitmq.entity.User;
import com.huzh.springbootrabbitmq.rabbit.many.ManySender1;
import com.huzh.springbootrabbitmq.rabbit.many.ManySender2;
import com.huzh.springbootrabbitmq.rabbit.one.OneSender;
import com.huzh.springbootrabbitmq.rabbit.fanout.FanoutSender;
import com.huzh.springbootrabbitmq.rabbit.object.ObjectSender;
import com.huzh.springbootrabbitmq.rabbit.hello.HelloSender;
import com.huzh.springbootrabbitmq.rabbit.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Date 2019/11/20 14:58
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private OneSender oneSender;

    @Autowired
    private ManySender1 manySender1;
    @Autowired
    private ManySender2 manySender2;

    @Autowired
    private ObjectSender objectSender;

    @Autowired
    private TopicSender topicSender;

    @Autowired
    private FanoutSender fanoutSender;

    @GetMapping("hello")
    public String helloTest() {
        helloSender.send();
        return "success";
    }

    @GetMapping("oneToMany")
    public String oneToManyTest() {
        for (int i = 0; i < 10; i++) {
            oneSender.send(i);
        }
        return "success";
    }

    @GetMapping("manyToMany")
    public String manyToManyTest() {
        for (int i = 0; i < 10; i++) {
            manySender1.send(i);
            manySender2.send(i);
        }
        return "success";
    }

    @GetMapping("objectSender")
    public String objectSenderTest() {
        User user = new User("admin", "123456");
        objectSender.sendUser(user);
        return "success";
    }

    @GetMapping("topicSender")
    public String topicSenderTest() {
//        topicSender.send1();
        topicSender.send2();
        return "success";
    }

    @GetMapping("fanoutSender")
    public String fanoutSenderTest() {
        fanoutSender.send();
        return "success";
    }

}
