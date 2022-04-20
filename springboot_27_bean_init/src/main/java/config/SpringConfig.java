package config;

import bean.Dog;
import bean.DogFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"bean","config"})
public class SpringConfig {
    @Bean
    public DogFactoryBean dog(){
        return new DogFactoryBean();
    }
}
