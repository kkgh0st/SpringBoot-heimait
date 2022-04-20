package config;

import bean.MyPostProcessor;
import bean.service.impl.BookServiceImpl1;
import org.springframework.context.annotation.Import;

@Import({BookServiceImpl1.class, MyPostProcessor.class})
public class SpringConfig7 {
}
