package com.example.springboot_13_configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class yml_format {
    @Value("${datasource.password}")
    private String passworld;

    @Test
    void test(){
        System.out.println(passworld);
    }
}
