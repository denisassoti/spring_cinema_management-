/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.repositories;

import com.denisassoti.cinema_management.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Denis ASSOTI
 */

@Repository
public interface VilleRepository extends JpaRepository<Ville, Long>{
    
}
