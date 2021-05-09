/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.impl;

import com.denisassoti.cinema_management.entities.Seance;
import com.denisassoti.cinema_management.services.interfaces.SeanceService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Denis ASSOTI
 */

@Service
public class SeanceServiceImpl implements SeanceService{

    @Override
    public List<Seance> getAllSeances() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSeance(Seance seance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance getSeanceById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSeanceById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
