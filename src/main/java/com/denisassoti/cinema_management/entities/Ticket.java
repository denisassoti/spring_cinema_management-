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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Denis ASSOTI
 */

@Entity
@Table(name="ticket")
public class Ticket extends BaseEntity{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_ticket") 
    private Long id;
    
    @Column(name = "nom_client",length = 60)
    private String nomClient;
    
    @Column(name = "prix")
    private double prix;
    
    @Column(name = "code_payement",unique = true)
    private int codePayement;
    
    @Column(name = "reserve")
    private boolean reserve;
    
    @ManyToOne
    private ProjectionFilm projectionFilm;
    
    @ManyToOne
    private Place place;

    public Ticket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getCodePayement() {
        return codePayement;
    }

    public void setCodePayement(int codePayement) {
        this.codePayement = codePayement;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public ProjectionFilm getProjectionFilm() {
        return projectionFilm;
    }

    public void setProjectionFilm(ProjectionFilm projectionFilm) {
        this.projectionFilm = projectionFilm;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
    
    
}
