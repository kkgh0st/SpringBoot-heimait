package com.example.springboot_13_configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.springboot_13_configuration.config.ServletConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@EnableConfigurationProperties({ServletConfig.class})
public class SpringBoot13ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        //dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBoot13ConfigurationApplication.class, args);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getDriverClassName());
        ServletConfig servletConfig = ctx.getBean(ServletConfig.class);
        System.out.println(servletConfig);
    }

}
