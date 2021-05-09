/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Seance;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface SeanceService {
    List<Seance> getAllSeances();
    void saveSeance(Seance seance);
    Seance getSeanceById(Long id);
    void deleteSeanceById(Long id);
}
