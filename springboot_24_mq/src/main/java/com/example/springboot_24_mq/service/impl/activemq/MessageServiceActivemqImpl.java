package com.example.springboot_24_mq.service.impl.activemq;

import com.example.springboot_24_mq.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

//@Service
public class MessageServiceActivemqImpl implements MessageService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已经纳入处理队列，id: " + id);;
        jmsMessagingTemplate.convertAndSend(id);
        // jmsMessagingTemplate.convertAndSend("order.queue.id",id);
    }

    @Override
    public String doMessage() {
        String id = jmsMessagingTemplate.receiveAndConvert(String.class);
        System.out.println("已完成订单发送业务，id:" + id);
        // jmsMessagingTemplate.convertAndSend("order.queue.id",id);
        return id;
    }
}
