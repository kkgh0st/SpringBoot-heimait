package com.example.springboot_14_test;

import com.example.springboot_14_test.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({MsgConfig.class})
public class ConfigurationTest {
    @Autowired
    private String msg;

    @Test
    void main(){
        System.out.println(msg);
    }
}
