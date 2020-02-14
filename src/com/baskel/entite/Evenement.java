/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baskel.entite;

import java.sql.Date;

/**
 *
 * @author MedKouti
 */
public class Evenement {
    private int id_evt;
    private String titre;
    private String description;
    private String lieu;
    private Date date;
    private int nbr;


    public Evenement(int id,String titre, String description, String lieu, Date date,int nbr) {
        this.id_evt=id;
        this.titre = titre;
        this.description = description;
        this.lieu = lieu;
        this.date = date;
        this.nbr = nbr;
        
    }

    public Evenement() {
       
    }

    public int getId_evt() {
        return id_evt;
    }

    public void setId_evt(int id_evt) {
        this.id_evt = id_evt;
    }

    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }
    

    @Override
    public String toString() {
        return "Evenement{" + "id_evt=" + id_evt + ", titre=" + titre + ", description=" + description + ", lieu=" + lieu + ", date=" + date + '}';
    }
    
    
    
    
}
