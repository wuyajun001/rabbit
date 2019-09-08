package com.rabbitmq.rabbit.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * description:<RabbitMQ配置类>
 *
 * @author 武亚军 (wuyajun0928@aliyun.com)
 * @version 1.0
 * @date 2019/9/6 16:17
 */
@Configuration
public class RabbitConfig {

    public static final String MESSAGE = "rabbitMQ";

    @Bean
    public Queue string(){
        return new Queue(MESSAGE);
    }

}
