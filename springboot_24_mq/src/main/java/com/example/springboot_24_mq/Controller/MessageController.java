package com.example.springboot_24_mq.Controller;

import com.example.springboot_24_mq.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public String doMessage(){
        String id = messageService.doMessage();
        return id;
    }
}
