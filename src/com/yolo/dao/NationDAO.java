/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.NationDTO;
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
}
