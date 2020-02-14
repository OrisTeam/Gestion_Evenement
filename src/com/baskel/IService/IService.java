/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baskel.IService;

import com.baskel.entite.Commentaire;
import com.baskel.entite.Evenement;
import com.baskel.entite.Publication;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MedKouti
 */
public interface IService {
    void ajouter_evt(Evenement e) throws SQLException;
    boolean update_evt(Evenement e)throws SQLException;
    boolean delete_evt(Evenement e)throws SQLException;
    List<Evenement> readall_evt()throws SQLException;
    
    
    void ajouter_pub(Publication p)throws SQLException;
    boolean update_pub(Publication p)throws SQLException;
    boolean delete_pub(Publication p)throws SQLException;
    List<Publication> readall_pub()throws SQLException;
    
    
    void ajouter_cmt(Commentaire c)throws SQLException;
    boolean update_cmt(Commentaire c)throws SQLException;
    boolean delete_cmt(Commentaire c)throws SQLException;
    List<Commentaire> readall_cmt()throws SQLException;
    
}
