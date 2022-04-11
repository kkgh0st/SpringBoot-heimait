package com.example.springboot_16_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringBoot16RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void set(){
        // 对Value相关的操作
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("age", 41);
    }

    @Test
    void get(){
        // 对Value相关的操作
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object obj = valueOperations.get("age");
        System.out.println(obj);
    }

    @Test
    void hset(){
        // 对Value相关的操作
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("info", "a", "aa");
    }

    @Test
    void hget(){
        // 对Value相关的操作
        HashOperations hashOperations = redisTemplate.opsForHash();
        Object var = hashOperations.get("info", "a");
        System.out.println(var);
    }



}
