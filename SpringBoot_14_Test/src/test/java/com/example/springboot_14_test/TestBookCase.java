package com.example.springboot_14_test;

import com.example.springboot_14_test.Domain.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookCase {

    @Autowired
    BookCase bookCase;

    @Test
    void BookCaseTest(){
        System.out.println(bookCase);
    }
}
