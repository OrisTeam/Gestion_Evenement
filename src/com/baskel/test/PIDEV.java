/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baskel.test;

import com.baskel.Service.IServiceImpl;
import com.baskel.entite.Commentaire;
import com.baskel.entite.Evenement;
import com.baskel.entite.Publication;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MedKouti
 */
public class PIDEV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, SQLException {
       
            // TODO code application logic here
            Evenement e=new Evenement(4, "sorite velo","1111","222222", Date.valueOf("2020-03-14"),0);
            Publication p=new Publication(2,"what's up guys",Date.valueOf("2020-02-14"));
            Commentaire c=new Commentaire(2, 1, "bienvenue", Date.valueOf("2020-03-15"));
            IServiceImpl i=new IServiceImpl();
            i.ajouter_evt(e);
            //System.out.println(i.update_evt(e));
            //System.out.println(i.delete_evt(e));
            //System.out.println(i.readall_evt());
          // i.ajouter_pub(p);
           // i.ajouter_cmt(c);
           //i.update_cmt(c);
           //i.update_pub(p);
          // i.delete_cmt(c);
          // i.delete_pub(p);
         // System.out.println(i.readall_pub());
          //System.out.println(i.readall_cmt());
          
               
        }
    }
    

