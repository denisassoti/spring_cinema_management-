/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Film;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface FilmService {
    List<Film> getAllFilms();
    void saveFilm(Film film);
    Film getFilmById(Long id);
    void deleteFilmById(Long id);
}
