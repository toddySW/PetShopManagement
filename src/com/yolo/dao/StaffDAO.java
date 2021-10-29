/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.StaffDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOCHUNG
 */
public class StaffDAO {
    DatabaseServices db = new DatabaseServices();
    
    public ArrayList<StaffDTO> getListStaff(){
        String sql = "SELECT * FROM staff";
        ArrayList<StaffDTO> arr = new ArrayList<StaffDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                StaffDTO staff = new StaffDTO();
                staff.setStaffID(rs.getInt("staffid"));
                staff.setStaffName(rs.getString("fullname"));
                staff.setDateOfBirth(rs.getDate("dateofbirth"));
                staff.setGender(rs.getBoolean("gender"));                
                staff.setAddress(rs.getString("address"));
                staff.setPhone(rs.getString("phone"));
                staff.setImage(rs.getString("image"));
                staff.setEmail(rs.getString("Email"));
                staff.setUserName(rs.getString("username"));
                staff.setPassWord(rs.getString("password"));
                staff.setStatus(rs.getInt("Status"));
                staff.setRole(rs.getInt("Role"));
                arr.add(staff);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    public boolean login(String userName, String passWord){
        String sql = "select * from staff where username = '" + userName +"' and password = '"+ passWord +"'";
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
                return true;
            }   
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }
    
    public String[] quenMKUserName(String userName){
        String sql = "select email, password from staff where username = '" + userName +"'";
        String[] str = new String[2];
        str[0] = "";
        str[1] = "";
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                str[0] = rs.getString("email");
                str[1] = rs.getString("password");
            }   
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
    public String[] quenMKEmail(String email){
        String sql = "select email, password from staff where email = '"+ email +"'";
        String[] str = new String[2];
        str[0] = "";
        str[1] = "";
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                str[0] = rs.getString("email");
                str[1] = rs.getString("password");
            }  
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
}
