/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.interfaces;

import com.denisassoti.cinema_management.entities.Categorie;
import java.util.List;

/**
 *
 * @author Denis ASSOTI
 */
public interface CategorieService {
    List<Categorie> getAllCategories();
    void saveCategorie(Categorie categorie);
    Categorie getCategorieById(Long id);
    void deleteCategorieById(Long id);
}
