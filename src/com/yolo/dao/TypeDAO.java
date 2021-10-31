/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.TypeDTO;
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
public class TypeDAO {
    DatabaseServices db = new DatabaseServices();
    
    public ArrayList<TypeDTO> getListType(){
        String sql = "SELECT * FROM typeproduct";
        ArrayList<TypeDTO> arr = new ArrayList<TypeDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                TypeDTO nation = new TypeDTO();
                nation.setTypeID(rs.getInt("TypeID"));
                nation.setTypeName(rs.getString("TypeName"));
                nation.setStatus(rs.getInt("Status"));
                arr.add(nation);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public boolean addType(TypeDTO type) {
        String sql = "INSERT INTO `typeproduct`(`TypeName`, `Status`)"
                + "VALUES (?, ?)";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setString(1, type.getTypeName());
            st.setInt(2, type.getStatus());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean deleteType(int id) {
        String sql = "UPDATE typeproduct SET status = 1 WHERE typeid =?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean updateType(TypeDTO type) {
        String sql = "UPDATE `typeproduct` SET "
                + "`typeName` = ?, "
                + "`Status` = ? "
                + "WHERE `typeID` = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(2, type.getStatus());
            st.setString(1, type.getTypeName());
            st.setInt(3, type.getTypeID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
