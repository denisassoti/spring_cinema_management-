/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.impl;

import com.denisassoti.cinema_management.entities.Ticket;
import com.denisassoti.cinema_management.services.interfaces.TicketService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Denis ASSOTI
 */

@Service
public class TicketServiceImpl implements TicketService{

    @Override
    public List<Ticket> getAllTickets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveTicket(Ticket ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ticket getTicketById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTicketById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
