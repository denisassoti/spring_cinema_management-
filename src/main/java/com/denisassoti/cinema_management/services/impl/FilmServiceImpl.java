/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.impl;

import com.denisassoti.cinema_management.entities.Film;
import com.denisassoti.cinema_management.services.interfaces.FilmService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Denis ASSOTI
 */

@Service
public class FilmServiceImpl implements FilmService{

    @Override
    public List<Film> getAllFilms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveFilm(Film film) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Film getFilmById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFilmById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
