package com.rabbitmq.rabbit.controller;

import com.rabbitmq.rabbit.mq.RabbitProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:<消息生产者欢迎页>
 *
 * @author 武亚军 (wuyajun0928@aliyun.com)
 * @version 1.0
 * @date 2019/9/6 16:01
 */
@RestController
@RequestMapping("/")
public class WelcomeController {


    @Autowired
    private RabbitProduct rabbitProduct;

    @RequestMapping(value = "/")
    public String welcome() {
        return "<h1>This is RabbitMQ Product !</h1>";
    }

    @RequestMapping(value = "/send")
    public void sendMessage() {

        for (int i = 0; i < 10; i++) {
            rabbitProduct.messageSend();
        }

    }

}
