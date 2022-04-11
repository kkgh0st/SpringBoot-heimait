package com.example.springboot_quick_starter;

import com.example.springboot_quick_starter.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootQuickStarterApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void test() {
        bookDao.selectById(1);
    }

}
