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
public class Publication {
    private int pub_id;
    private String texte;
    private Date date;

    public Publication(int pub_id, String texte, Date date) {
        this.pub_id = pub_id;
        this.texte = texte;
        this.date = date;
    }

    public Publication() {
        
    }

    public int getPub_id() {
        return pub_id;
    }

    public void setPub_id(int pub_id) {
        this.pub_id = pub_id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Publication{" + "pub_id=" + pub_id + ", texte=" + texte + ", date=" + date + '}';
    }
    
    
}
