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
public class Commentaire {
    private int com_id;
    private int pub_id;
    private String texte;
    private Date date;

    public Commentaire(int com_id, int pub_id, String texte, Date date) {
        this.com_id = com_id;
        this.pub_id = pub_id;
        this.texte = texte;
        this.date = date;
    }

    public Commentaire() {
        
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
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
        return "Commentaire{" + "com_id=" + com_id + ", pub_id=" + pub_id + ", texte=" + texte + ", date=" + date + '}';
    }
    
    
    
}
