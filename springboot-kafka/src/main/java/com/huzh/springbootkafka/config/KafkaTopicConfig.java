//package com.huzh.springbootkafka.config;
//
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.Resource;
//
///**
// * @author huzh
// * @date 2021.1.24 23:13
// */
//@Configuration
//@EnableConfigurationProperties(KafkaTopicProperties.class)
//public class KafkaTopicConfig {
//
//    @Resource
//    private  KafkaTopicProperties properties;
//
////    @Autowired
////    public KafkaTopicConfiguration(KafkaTopicProperties properties) {
////        this.properties = properties;
////    }
//
//    @Bean
//    public String[] kafkaTopicName() {
//        return properties.getTopicName();
//    }
//
//    @Bean
//    public String topicGroupId() {
//        return properties.getGroupId();
//    }
//
//}
