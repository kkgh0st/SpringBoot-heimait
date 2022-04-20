package app;

import config.SpringConfig;
import config.SpringConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig2.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("--------------------------------");
        SpringConfig2 springConfig2 = applicationContext.getBean("springConfig2",SpringConfig2.class);
        System.out.println(springConfig2.cat());
        System.out.println(springConfig2.cat());
        System.out.println(springConfig2.cat());
    }
}
