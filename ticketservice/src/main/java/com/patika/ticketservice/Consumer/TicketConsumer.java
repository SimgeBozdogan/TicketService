package com.patika.ticketservice.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TicketConsumer {

    @RabbitListener(queues = "ticketQueue")
    public void receiveMessage(String ticketInfo) {
        System.out.println("Received Ticket: " + ticketInfo);
    }
}
