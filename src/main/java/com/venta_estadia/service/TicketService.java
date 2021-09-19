package com.venta_estadia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta_estadia.model.Ticket;
import com.venta_estadia.repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository ticketRepository;
	
	public Optional<Ticket> getById(Long id){
		return ticketRepository.SP_GetTicket(id);
		
	}

}
