package com.com.rabbitmqforeign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.com.rabbitmqforeign.mq")
public class RabbitmqForeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqForeignApplication.class, args);
    }

}
