package com.example.springboot_quick_starter.service.impl;

import com.example.springboot_quick_starter.dao.BookDao;
import com.example.springboot_quick_starter.domian.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.springboot_quick_starter.service.BookService;

import java.util.HashMap;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    private HashMap<Integer, Book> cache = new HashMap<Integer, Book>();

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

/*    @Override
    public Book getById(Integer id) {
        Book book = cache.get(id);
        if(book == null){
            System.out.println("缓存!");
            Book queryBook = bookDao.selectById(id);
            cache.put(id,queryBook);
            return queryBook;
        }
        return book;
    }*/

    @Override
    @Cacheable(value="cacheSpace",key="#id")
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
