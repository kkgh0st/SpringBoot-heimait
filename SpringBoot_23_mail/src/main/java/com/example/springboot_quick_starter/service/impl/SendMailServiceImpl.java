package com.example.springboot_quick_starter.service.impl;

import com.example.springboot_quick_starter.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl implements SendMailService {
    @Autowired
    private JavaMailSender javaMailSender;

    // 发送人
    private String from = "979052016@qq.com";
    // 接收人
    private String to = "979052016@qq.com";
    // 标题
    private String subject = "测试邮件";
    // 正文
    private String context = "测试邮件正文";

    @Override
    public void sendMail() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(from);
        msg.setTo(to);
        msg.setSubject(subject);
        msg.setText(context);
        javaMailSender.send(msg);

    }
}
