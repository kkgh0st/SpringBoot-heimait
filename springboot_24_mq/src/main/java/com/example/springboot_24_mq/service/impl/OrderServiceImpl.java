package com.example.springboot_24_mq.service.impl;

import com.example.springboot_24_mq.service.MessageService;
import com.example.springboot_24_mq.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MessageService messageService;

    @Override
    public void order(String id) {
        // 一些列操作，包含各种服务调用，处理各种业务
        System.out.println("订单处理开始");
        //
        messageService.sendMessage(id);

        //
        System.out.println("订单处理结束");
    }
}
