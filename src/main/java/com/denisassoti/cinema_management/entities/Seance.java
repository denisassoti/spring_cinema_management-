/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Denis ASSOTI
 */

@Entity
@Table(name="seance")
public class Seance extends BaseEntity{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_seance") 
    private Long id;
    
    @Column(name = "heure_debut", length = 40)
    private String heureDebut;
    
    @OneToOne
    private ProjectionFilm projectionFilm;

    public Seance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public ProjectionFilm getProjectionFilm() {
        return projectionFilm;
    }

    public void setProjectionFilm(ProjectionFilm projectionFilm) {
        this.projectionFilm = projectionFilm;
    }
    
    
}
