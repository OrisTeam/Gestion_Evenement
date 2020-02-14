/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baskel.Service;

import com.baskel.IService.IService;
import com.baskel.Utils.DB_conn;
import com.baskel.entite.Commentaire;
import com.baskel.entite.Evenement;
import com.baskel.entite.Publication;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class IServiceImpl implements IService {
    
    private Connection con;
    private Statement ste;
    
    
    public IServiceImpl(){
        con = DB_conn.getInstance().getConnexion();
    }

    
    @Override
    public void ajouter_evt(Evenement e) throws SQLException{
        PreparedStatement pre=con.prepareStatement("INSERT INTO evenement (id_evt,titre,description,lieu,date,nbr_participants) VALUES (?,?,?,?,?,?);");
        pre.setInt(1,e.getId_evt());
        pre.setString(2,e.getTitre());
        pre.setString(3,e.getDescription());
        pre.setString(4,e.getLieu());
        pre.setDate(5, (Date) e.getDate());
        pre.setInt(6,e.getNbr());
        pre.executeUpdate();
        //System.out.println("ajouter :)");
    }

    @Override
    public boolean update_evt(Evenement e) throws SQLException{
        PreparedStatement pre=con.prepareStatement("update evenement set titre= ?, description= ?, lieu= ?, date= ? "
                + "where id_evt= ?");
        pre.setString(1,e.getTitre());
        pre.setString(2,e.getDescription());
        pre.setString(3,e.getLieu());
        pre.setDate(4, (Date) e.getDate());
        pre.setInt(5,e.getId_evt());
        pre.executeUpdate();
        return true;  
    }

    @Override
    public boolean delete_evt(Evenement e) throws SQLException {
        PreparedStatement pre=con.prepareStatement("delete from evenement where id_evt=?");
        pre.setInt(1,e.getId_evt());
        pre.executeUpdate();
        return true;
    }

    @Override
    public List<Evenement> readall_evt() throws SQLException {
        List<Evenement> evenements=new ArrayList<>();
        String req="select * from evenement";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(req);
            while(rs.next()){
                Evenement e=new Evenement();
                e.setId_evt(rs.getInt(1));
                e.setTitre(rs.getString(2));
                e.setDescription(rs.getString(3));
                e.setLieu(rs.getString(4));
                e.setDate(rs.getDate(5));
                evenements.add(e);
            }
        return evenements;
    }

    @Override
    public void ajouter_pub(Publication p) throws SQLException{
       PreparedStatement pre=con.prepareStatement("INSERT INTO publication (id_pub,texte,date) VALUES (?,?,?);");
        pre.setInt(1,p.getPub_id());
        pre.setString(2,p.getTexte());
        pre.setDate(3,p.getDate());
        pre.executeUpdate();
    }

    @Override
    public boolean update_pub(Publication p) throws SQLException{
       PreparedStatement pre=con.prepareStatement("update publication set texte=?,date=? where id_pub=?");
       pre.setString(1,p.getTexte());
       pre.setDate(2,Date.valueOf(LocalDate.now()));
       pre.setInt(3, p.getPub_id());
       pre.executeUpdate();
       return true;
    }

    @Override
    public boolean delete_pub(Publication p) throws SQLException{
         PreparedStatement pre=con.prepareStatement("delete from publication where id_pub=?");
        pre.setInt(1,p.getPub_id());
        pre.executeUpdate();
        return true;
    }

    @Override
    public List<Publication> readall_pub() throws SQLException{
        List<Publication> publications=new ArrayList<>();
        String req="select * from publication";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(req);
            while(rs.next()){
                Publication p=new Publication();
                p.setPub_id(rs.getInt(1));
                p.setTexte(rs.getString(2));
                p.setDate(rs.getDate(3));
                publications.add(p);
            }
            return publications;
    }

    @Override
    public void ajouter_cmt(Commentaire c) throws SQLException{
         PreparedStatement pre=con.prepareStatement("INSERT INTO commentaire (id_com,id_pub,texte,date) VALUES (?,?,?,?);");
        pre.setInt(1,c.getCom_id());
         pre.setInt(2,c.getPub_id());
        pre.setString(3,c.getTexte());
        pre.setDate(4,c.getDate());
        pre.executeUpdate();
    }

    @Override
    public boolean update_cmt(Commentaire c) throws SQLException{
       PreparedStatement pre=con.prepareStatement("update commentaire set texte=?,date=? where id_com=?");
       pre.setString(1,c.getTexte());
       pre.setDate(2,Date.valueOf(LocalDate.now()));
       pre.setInt(3, c.getCom_id());
       pre.executeUpdate();
       return true;
    }

    @Override
    public boolean delete_cmt(Commentaire c) throws SQLException{
         PreparedStatement pre=con.prepareStatement("delete from commentaire where id_com=?");
        pre.setInt(1,c.getCom_id());
        pre.executeUpdate();
        return true;
    }

    @Override
    public List<Commentaire> readall_cmt() throws SQLException{
        List<Commentaire> commentaires=new ArrayList<>();
        String req="select * from commentaire";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(req);
            while(rs.next()){
                Commentaire c=new Commentaire();
                c.setCom_id(rs.getInt(1));
                c.setPub_id(rs.getInt(2));
                c.setTexte(rs.getString(3));
                c.setDate(rs.getDate(4));
                commentaires.add(c);
            }
            return commentaires;
    }
    
}
