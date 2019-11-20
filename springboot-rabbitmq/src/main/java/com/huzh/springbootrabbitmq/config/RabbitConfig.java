package com.huzh.springbootrabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RabbitConfig
 * @Description TODO
 * @Date 2019/11/20 15:25
 * @Author huzh
 * @Version 1.0
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("message");
    }

    @Bean
    public Queue Queue2() {
        return new Queue("message2");
    }

    @Bean
    public Queue queue3() {
        return new Queue("object_queue");
    }

}
