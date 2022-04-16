package com.example.springboot_quick_starter.service;

import com.example.springboot_quick_starter.domian.SMSCode;

public interface SMSCodeService {
    public String sendCodeToSMS(String tele);
    public boolean checkCode(SMSCode smsCode);
}
