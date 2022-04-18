package com.example.springboot_24_mq.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @KafkaListener(topics = "itheima")
    public void onMessage(ConsumerRecord<String, String> consumerRecord){
        System.out.println("已完成订单发送业务，id:" + consumerRecord.value());
    }
}
