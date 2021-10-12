/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOCHUNG
 */
public class CustomerDAO {
    DatabaseServices db = new DatabaseServices();
    
    public boolean Login(String userName, String passWord){
        String sql = "";
        try {
            Statement st = db.Connection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            }   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
