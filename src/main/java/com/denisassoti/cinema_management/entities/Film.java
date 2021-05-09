/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denisassoti.cinema_management.entities;

import java.util.Date;
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
@Table(name="film")
public class Film extends BaseEntity{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_film") 
    private Long id;
    
    @Column(name = "titre",length = 60) 
    private String titre;
    
    @Column(name = "duree") 
    private int duree;
    
    @Column(name = "realisateur",length = 60) 
    private String realisateur;
    
    @Column(name = "description") 
    private String description;
    
    @Column(name = "photo") 
    private String photo;
    
    @Column(name = "date_sortie") 
    private Date datesortie;
    
    @ManyToOne
    private Categorie categorie;
    
    @OneToMany(mappedBy = "film")
    private List<ProjectionFilm> projectionFilms;

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<ProjectionFilm> getProjectionFilms() {
        return projectionFilms;
    }

    public void setProjectionFilms(List<ProjectionFilm> projectionFilms) {
        this.projectionFilms = projectionFilms;
    }
    
    

}
