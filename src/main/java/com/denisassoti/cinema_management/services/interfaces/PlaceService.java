/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Place;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface PlaceService {
    List<Place> getAllPlaces();
    void savePlace(Place place);
    Place getPlaceById(Long id);
    void deletePlaceById(Long id);
}
