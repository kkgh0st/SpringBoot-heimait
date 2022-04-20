import config.SpringConfig;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for(String bean: beans){
            System.out.println(bean);
        }
    }
}
