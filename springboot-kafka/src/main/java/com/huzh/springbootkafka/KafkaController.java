package com.huzh.springbootkafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YueXian
 * @date: 2024/1/8 18:11
 */
@RestController
public class KafkaController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("test")
    public void sendMessage() {
        kafkaTemplate.send("baidu-fusion-algorithm-events", "1111111111");
    }

    @KafkaListener(topics = "baidu-fusion-algorithm-events", groupId = "topicGroupId1")
    public void processMessage(ConsumerRecord<Integer, String> record) {

        String value = record.value();
        System.out.println("hhhhhh" + value);

    }
}
