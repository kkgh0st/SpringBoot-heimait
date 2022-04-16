package com.example.springboot_quick_starter.service;

import com.example.springboot_quick_starter.domian.Book;

import java.util.List;


public interface BookService {
    public boolean save(Book book);
    public Book getById(Integer id);
    public boolean update(Book book);
    public boolean delete(Integer id);
    public List<Book> getAll();
}
