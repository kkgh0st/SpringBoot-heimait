package config;

import bean.Dog;
import org.springframework.context.annotation.Import;

@Import({Dog.class,DbConfig.class})
public class SpringConfig3 {
}
