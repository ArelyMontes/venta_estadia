package com.venta_estadia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venta_estadia.model.Ticket;
import com.venta_estadia.service.TicketService;


@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@GetMapping(value="{id}")
	public ResponseEntity<Ticket>SP_GetTicket(@PathVariable("id") Long id){
		Optional<Ticket> ticket=ticketService.getById(id);
		return ResponseEntity.ok(ticket.get());
	}
}
