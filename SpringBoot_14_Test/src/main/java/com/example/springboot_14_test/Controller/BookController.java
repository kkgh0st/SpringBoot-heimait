package com.example.springboot_14_test.Controller;

import com.example.springboot_14_test.Domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public Book getById(){
        Book book = new Book();
        book.setId(1);
        book.setDescription("asddas");
        book.setName("asdasdasd");
        book.setName("sdfsdf");
        return book;
    }
}
