/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.impl;

import com.denisassoti.cinema_management.entities.Salle;
import java.util.List;
import com.denisassoti.cinema_management.services.interfaces.SalleService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Denis ASSOTI
 */

@Service
public class SalleServiceImpl implements SalleService{

    @Override
    public List<Salle> getAllSalles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSalle(Salle salle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salle getSalleById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSalleById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nombrePlaces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
