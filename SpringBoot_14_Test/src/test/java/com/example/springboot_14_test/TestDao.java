package com.example.springboot_14_test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
// @Rollback(value = false)
public class TestDao {

}
