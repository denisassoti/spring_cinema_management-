/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Cinema;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface CinemaService {
    List<Cinema> getAllCinemas();
    void saveCinema(Cinema cinema);
    Cinema getCinemaById(Long id);
    void deleteCinemaById(Long id);
    int nombreSalles();
}
