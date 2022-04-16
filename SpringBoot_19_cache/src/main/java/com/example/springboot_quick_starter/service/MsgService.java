package com.example.springboot_quick_starter.service;

public interface MsgService {
    public String get(String tele);
    public boolean check(String tele, String code);
}
