package com.example.springboot_24_mq.service;

public interface MessageService {
    void sendMessage(String id);
    String doMessage();
}
