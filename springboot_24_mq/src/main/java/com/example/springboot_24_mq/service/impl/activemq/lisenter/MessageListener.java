package com.example.springboot_24_mq.service.impl.activemq.lisenter;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

// @Component
public class MessageListener {
    @JmsListener(destination = "itheima")
    @SendTo("order.queue.id") // 将处理结果转发到order.queue.id
    public String receive(String id){
        System.out.println("已完成订单发送业务，id:" + id);
        return "new" + id;
    }

    @JmsListener(destination = "order.queue.id")
    public void receive2(String id){
        System.out.println("已完成订单发送业务，new_id:" + id);
    }
}
