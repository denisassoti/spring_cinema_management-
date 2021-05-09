/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Salle;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface SalleService {
    List<Salle> getAllSalles();
    void saveSalle(Salle salle);
    Salle getSalleById(Long id);
    void deleteSalleById(Long id);
    int nombrePlaces();
}
