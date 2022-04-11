package com.example.springboot_16_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class StringRedisTemplateTest {

    // 对象为单元进行操作的
    private RedisTemplate redisTemplate;

    // 字符串为单元进行操作的
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void get(){
        // 自定义泛型
        ValueOperations<String,String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        String name = stringStringValueOperations.get("name");
        System.out.println(name);
    }

}
