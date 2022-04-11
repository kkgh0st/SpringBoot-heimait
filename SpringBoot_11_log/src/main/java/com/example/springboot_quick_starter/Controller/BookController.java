package com.example.springboot_quick_starter.Controller;

import com.example.springboot_quick_starter.mysource.MyDataSource;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    // 创建记录日志的对象
    //private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String GetById(){

        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");

        return "SpringBoot is running!";
    }
}
