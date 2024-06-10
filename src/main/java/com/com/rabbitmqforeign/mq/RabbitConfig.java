package com.com.rabbitmqforeign.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    // 定义交换机名称
    public static final String DIRECT_EXCHANGE = "direct_exchange";
    // 定义队列名称
    public static final String SEND_QUEUE = "send_queue";
    // 定义路由键
    public static final String ROUTING_KEY = "send";

    // 配置DirectExchange
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    // 配置Queue
    @Bean
    public Queue orderQueue() {
        return new Queue(SEND_QUEUE);
    }

    // 绑定Queue到Exchange上，并定义匹配的routing key
    @Bean
    public Binding binding(Queue orderQueue, DirectExchange exchange) {
        return BindingBuilder.bind(orderQueue).to(exchange).with(ROUTING_KEY);
    }
}