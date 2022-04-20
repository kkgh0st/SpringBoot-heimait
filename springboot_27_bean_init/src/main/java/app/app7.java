package app;

import bean.service.BookService;
import config.SpringConfig6;
import config.SpringConfig7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig7.class);
        BookService bookService = applicationContext.getBean("bookService",BookService.class);
        bookService.check();
    }
}
