package config;

import bean.Cat;
import bean.Mouse;
import bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

// @Import(MyImportSelector.class)
public class SpringConfig {
    @Bean
    @ConditionalOnClass(name = "Mouse.class")
    @ConditionalOnMissingClass("bean.Mouse")
    public Cat tom(){
        return new Cat();
    }
}
