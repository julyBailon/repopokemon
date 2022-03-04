package com.spring.demo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.demo.entity.Ticket;

import com.spring.demo.repository.TicketRepository;

@Service
public class TicketService {
/*	private TicketRepository ticketrepository;
	
	@Autowired
	public TicketService( TicketRepository ticketrepository) {
		this.ticketrepository = ticketrepository;
	}
	
	public List<Ticket> findPaisesById(Date fecha){
		List<Ticket> ticketRespuesta=new ArrayList();
		List<Ticket> ticket=ticketrepository.findAll();
		for(int i=0;i<ticket.size();i++) {
			if(ticket.get(i).getCreateDate()==fecha) {
				ticketRespuesta.add(ticket.get(i));
			}
			
		}
		
		return ticketRespuesta;
	}
	
*/
}
