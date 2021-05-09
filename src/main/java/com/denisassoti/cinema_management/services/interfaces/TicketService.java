/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Ticket;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface TicketService {
    List<Ticket> getAllTickets();
    void saveTicket(Ticket ticket);
    Ticket getTicketById(Long id);
    void deleteTicketById(Long id);
}
