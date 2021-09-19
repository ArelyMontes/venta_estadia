package com.venta_estadia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.venta_estadia.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
	@Query (value="{call SP_GetTicket(:idT)}", nativeQuery=true) 
	Optional<Ticket> SP_GetTicket(@Param("idT") Long id);

}
