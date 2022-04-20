package app;

import config.SpringConfig5;
import config.SpringConfig6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig6.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
