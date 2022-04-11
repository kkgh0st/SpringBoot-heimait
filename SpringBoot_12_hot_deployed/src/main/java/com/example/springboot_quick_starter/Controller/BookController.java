package com.example.springboot_quick_starter.Controller;

import com.example.springboot_quick_starter.mysource.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {



    @GetMapping
    public String GetById(){
        System.out.println("go go go");
        System.out.println("go go go");
        System.out.println("go go go");
        return "SpringBoot is running!";
    }
}
