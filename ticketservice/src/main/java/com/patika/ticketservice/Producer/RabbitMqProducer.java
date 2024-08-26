package com.patika.ticketservice.Producer;

import com.patika.ticketservice.Producer.dto.SendEmailMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendEmail(SendEmailMessage message) {
        rabbitTemplate.convertAndSend("emailQueue", message);
    }
}
