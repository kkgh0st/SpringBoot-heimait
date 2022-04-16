package com.example.springboot_quick_starter.controller;

import com.example.springboot_quick_starter.domian.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot_quick_starter.service.BookService;
import com.example.springboot_quick_starter.service.impl.BookServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping("{id}")
    public Book get(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("{id}")
    public boolean delete(Integer id){
        return bookService.delete(id) ;
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

}
