package com.example.springboot_17_mongodb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

class Book{
    private int id;
    private String name;
    private Integer price;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    Book(int id, String name, Integer price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

@SpringBootTest
class SpringBoot17MongodbApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void save() {
        Book book = new Book(1,"SpringBoot",123);
        mongoTemplate.save(book);

        Book book2 = new Book(2,"SpringBoot2",1232);
        mongoTemplate.save(book2);

        Book book3 = new Book(3,"SpringBoot3",1232);
        mongoTemplate.save(book3);
    }

    @Test
    void find(){
        List<Book> list = mongoTemplate.findAll(Book.class);
        System.out.println(list);
    }

}
