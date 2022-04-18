package com.example.springboot_quick_starter.test;

import com.example.springboot_quick_starter.service.SendMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SendMailSerivice {
    @Autowired
    SendMailService sendMailService;

    @Test
    void doTest(){
        sendMailService.sendMail();
    }
}
