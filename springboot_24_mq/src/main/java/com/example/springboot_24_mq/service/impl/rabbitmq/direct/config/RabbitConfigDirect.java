package com.example.springboot_24_mq.service.impl.rabbitmq.direct.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfigDirect {
    @Bean
    public Queue DirectQueue(){
        return new Queue("direct_queue", true,true,true);
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding bindDirect() {
        return BindingBuilder.bind(DirectQueue()).to(directExchange()).with("direct");

    }
}
