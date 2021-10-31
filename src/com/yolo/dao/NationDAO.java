/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.NationDTO;
import com.yolo.dto.NationDTO;
import java.sql.PreparedStatement;
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
public class NationDAO {
    DatabaseServices db = new DatabaseServices();
    
    public ArrayList<NationDTO> getListNation(){
        String sql = "SELECT * FROM nation";
        ArrayList<NationDTO> arr = new ArrayList<NationDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                NationDTO nation = new NationDTO();
                nation.setNationID(rs.getString("NationID"));
                nation.setNationName(rs.getString("NationName"));
                nation.setStatus(rs.getInt("Status"));
                arr.add(nation);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public boolean addNation(NationDTO nation) {
        String sql = "INSERT INTO `nation`(`NationID`, `NationName`, `Status`)"
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setString(1, nation.getNationID());
            st.setString(2, nation.getNationName());
            st.setInt(3, nation.getStatus());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean deleteNation(String id) {
        String sql = "UPDATE nation SET status = 1 WHERE nationid =?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean updateNation(NationDTO nation) {
        String sql = "UPDATE `nation` SET "
                + "`nationName` = ?, "
                + "`Status` = ? "
                + "WHERE `nationID` = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(2, nation.getStatus());
            st.setString(1, nation.getNationName());
            st.setString(3, nation.getNationID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
