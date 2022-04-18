package com.example.springboot_24_mq.service.impl.rabbitmq.topic.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// @Component
public class MessageListener {
    @RabbitListener(queues = "topic_queue1")
    public void receive(String id){
        System.out.println("已完成订单发送业务，id(RabbitMq1 Topic1):" + id);
    }

    @RabbitListener(queues = "topic_queue2")
    public void receive2(String id){
        System.out.println("已完成订单发送业务，id(RabbitMq1 Topic2):" + id);
    }
}
