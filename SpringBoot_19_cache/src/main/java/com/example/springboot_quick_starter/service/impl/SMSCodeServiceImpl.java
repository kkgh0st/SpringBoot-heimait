package com.example.springboot_quick_starter.service.impl;

import com.example.springboot_quick_starter.Utils.CodeUtils;
import com.example.springboot_quick_starter.domian.SMSCode;
import com.example.springboot_quick_starter.service.SMSCodeService;
import com.github.mustachejava.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    @Override
    // @Cacheable(value="cacheSpace",key="#id")
    @CachePut(value = "smsCode", key = "#tele")
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = smsCode.getCode();
        String cacheCode = codeUtils.get(smsCode.getTele());
        return code.equals(cacheCode);
    }
}
