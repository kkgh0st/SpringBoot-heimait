package com.example.springboot_24_mq.service.impl.rabbitmq.direct;

import com.example.springboot_24_mq.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class MessageServiceRabbitmqDirectImpl implements MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已经纳入处理队列，id: " + id);;
        amqpTemplate.convertAndSend("directExchange","direct", id);

    }

    @Override
    public String doMessage() {
        // System.out.println("已完成订单发送业务，id:" + id);
        return null;
    }
}
