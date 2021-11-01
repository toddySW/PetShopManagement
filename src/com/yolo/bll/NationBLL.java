/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.NationDAO;
import com.yolo.dto.NationDTO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOCHUNG
 */
public class NationBLL {
    NationDAO nationDAO = new NationDAO();
    public ArrayList<NationDTO> getListNation(){
        return nationDAO.getListNation();
    }
    public void exportFile(String path){
        try {
            File f = new File(path + "/Nation.csv");
            FileWriter w = new FileWriter(f);
            w.write("ID; Name \n");
            for (NationDTO nationDTO : getListNation()) {
                w.write(nationDTO.getNationID()+";\t"+nationDTO.getNationName()+"\n");
            } 
            w.close();
            
        } catch (IOException ex) {
            Logger.getLogger(NationBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showNationTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[2];
        for (NationDTO nation : getListNation()) {
            data[0] = nation.getNationID();
            data[1] = nation.getNationName();           
            model.addRow(data);
        }
    }
    public boolean addNation(NationDTO nation){
        if (nationDAO.addNation(nation)) {
            return true;
        }
        return false;
    }
    public boolean deleteNation(String id){
        if (nationDAO.deleteNation(id)) {
            return true;
        }
        return false;
    }
    public boolean updateNation(NationDTO nation){
        if (nationDAO.updateNation(nation)) {
            return true;
        }
        return false;
    }
    
}
