package com.example.springboot_quick_starter;

import com.example.springboot_quick_starter.Controller.BookController;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootQuickStarterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootQuickStarterApplication.class, args);
        BookController bean = ctx.getBean(BookController.class);
        System.setProperty("spring.devtools.restart.enabled","false");
        System.out.println("bean =====> " + bean);
    }

}
