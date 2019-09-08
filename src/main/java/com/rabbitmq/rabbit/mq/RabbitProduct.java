package com.rabbitmq.rabbit.mq;

import com.rabbitmq.rabbit.utils.DateUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * description:<消息生产者>
 *
 * @author 武亚军 (wuyajun0928@aliyun.com)
 * @version 1.0
 * @date 2019/9/6 16:26
 */
@Component
public class RabbitProduct {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void messageSend() {
        Date currentDate = new Date();
        String dateString = DateUtil.formatDate(currentDate, DateUtil.YYYY_MM_DD_HH_MM_SS);
        System.out.println("send msg:" + dateString);
        // 第一个参数为刚刚定义的队列名称
        this.rabbitTemplate.convertAndSend(RabbitConfig.MESSAGE, dateString);
    }

}
