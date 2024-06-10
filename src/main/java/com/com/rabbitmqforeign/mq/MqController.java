package com.com.rabbitmqforeign.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fmq")
public class MqController {


    @PostMapping("/revice")
    public void revice(){
     /* foreignMqMapper.insert("我是外网");*/
    }
    @PostMapping("/send")
    public  void send(){

    }
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public  void sendOrderMessage(String message) {
        rabbitTemplate.convertAndSend("direct_exchange", "send", message);
    }
}
