package com.patika.ticketservice.Producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendTicket(String ticketInfo) {
        rabbitTemplate.convertAndSend("ticketQueue", ticketInfo);
    }
}
