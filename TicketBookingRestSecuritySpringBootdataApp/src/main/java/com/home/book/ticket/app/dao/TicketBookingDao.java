package com.home.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.home.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
