package com.huzh.springbootrabbitmq.rabbit;

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
    public Queue helloQueue() {
        return new Queue("hello");
    }
    @Bean
    public Queue oneQueue() {
        return new Queue("oneQueue");
    }

    @Bean
    public Queue manyQueue() {
        return new Queue("manyQueue");
    }

    @Bean
    public Queue queue3() {
        return new Queue("object_queue");
    }

}
