package com.patika.ticketservice.service;

import com.patika.ticketservice.model.Ticket;
import com.patika.ticketservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void cancelTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
