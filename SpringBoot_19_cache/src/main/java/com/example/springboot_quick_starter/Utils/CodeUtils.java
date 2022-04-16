package com.example.springboot_quick_starter.Utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CodeUtils {
    public String generator(String tele){
        int hash = tele.hashCode();
        int encryption = 20206666;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();
        String patch[] = {"00000","0000","000","00","0",""};
        return patch[len-1] + codeStr;
    }

    @Cacheable(value = "smsCode", key="#tele")
    public String get(String tele){
        return null;
    }
}
