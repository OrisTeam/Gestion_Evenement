/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baskel.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MedKouti
 */
public class DB_conn {
    Connection cnx;
    String url="jdbc:mysql://localhost:3306/pidev";
        String login="root";
        String mdp="";
        static DB_conn instance;
       private DB_conn(){
        try {
            cnx=DriverManager.getConnection(url,login,mdp);
            System.out.println("connecetion etablie");
        } catch (SQLException ex) {
            Logger.getLogger(DB_conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       public Connection getConnexion(){
           return cnx;
       }
       public static DB_conn getInstance(){
           if(instance==null){
           instance=new DB_conn();}
           return instance;
           
       }
    
}
