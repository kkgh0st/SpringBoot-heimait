package app;

import config.SpringConfig5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig5.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
