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
    
    public boolean login(String userName, String passWord){
        String sql = "select * from customer where username = '" + userName +"' and password = '"+ passWord +"'";
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
    
    public String[] quenMKUserName(String userName){
        String sql = "select email, password from customer where username = '" + userName +"'";
        String[] str = new String[2];
        str[0] = "";
        str[1] = "";
        try {
            Statement st = db.Connection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                str[0] = rs.getString("email");
                str[1] = rs.getString("password");
            }   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
    public String[] quenMKEmail(String email){
        String sql = "select email, password from customer where email = '"+ email +"'";
        String[] str = new String[2];
        str[0] = "";
        str[1] = "";
        try {
            Statement st = db.Connection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                str[0] = rs.getString("email");
                str[1] = rs.getString("password");
            }   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
    
}
