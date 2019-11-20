package com.huzh.springbootrabbitmq.controller;

import com.huzh.springbootrabbitmq.entity.User;
import com.huzh.springbootrabbitmq.sender.FanoutSender;
import com.huzh.springbootrabbitmq.sender.ObjectSender;
import com.huzh.springbootrabbitmq.sender.Sender;
import com.huzh.springbootrabbitmq.sender.TopicSender;
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
    private Sender sender;

    @Autowired
    private Sender sender1;

    @Autowired
    private ObjectSender objectSender;

    @Autowired
    private TopicSender topicSender;

    @Autowired
    private FanoutSender fanoutSender;

    @GetMapping("hello")
    public String helloTest() {
        sender.send();
        return "success";
    }

    @GetMapping("oneToMany")
    public String oneToManyTest() {
        for (int i = 0; i < 10; i++) {
            sender.send2(i);
        }
        return "success";
    }

    @GetMapping("manyToMany")
    public String manyToManyTest() {
        for (int i = 0; i < 10; i++) {
            sender.send2(i);
            sender1.send2(i);
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
