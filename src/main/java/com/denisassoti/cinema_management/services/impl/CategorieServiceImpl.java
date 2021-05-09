/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.services.impl;

import com.denisassoti.cinema_management.entities.Categorie;
import com.denisassoti.cinema_management.services.interfaces.CategorieService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Denis ASSOTI
 */

@Service
public class CategorieServiceImpl implements CategorieService{

    @Override
    public List<Categorie> getAllCategories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveCategorie(Categorie categorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categorie getCategorieById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCategorieById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
