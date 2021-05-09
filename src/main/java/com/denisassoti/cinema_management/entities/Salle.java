/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Denis ASSOTI
 */

@Entity
@Table(name="salle")
public class Salle extends BaseEntity{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_salle") 
    private Long id;
    
    @Column(name = "nom_salle",length = 60) 
    private String nom;
    
    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "salle")
    private List<ProjectionFilm> projectionFilms;
    
    @OneToMany(mappedBy = "salle")
    private List<Place> places;
    
    public Salle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<ProjectionFilm> getProjectionFilms() {
        return projectionFilms;
    }

    public void setProjectionFilms(List<ProjectionFilm> projectionFilms) {
        this.projectionFilms = projectionFilms;
    }
    
    
}
