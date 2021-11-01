/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.TypeDAO;
import com.yolo.dto.TypeDTO;
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
public class TypeBLL {
    TypeDAO typeDAO = new TypeDAO();
    public ArrayList<TypeDTO> getListType(){
        return typeDAO.getListType();
    }
    public void exportFile(String path){
        try {
            File f = new File(path + "/Type.csv");
            FileWriter w = new FileWriter(f);
            w.write("TypeID; TypeName\n");
            for (TypeDTO typeDTO : getListType()) {
                w.write(typeDTO.getTypeID()+";\t"
                        +typeDTO.getTypeName()+";\n");
            } 
            w.close();  
        } catch (IOException ex) {
            Logger.getLogger(TypeBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showTypeTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[2];
        for (TypeDTO type : getListType()) {
            data[0] = type.getTypeID();
            data[1] = type.getTypeName();           
            model.addRow(data);
        }
    }
    public boolean addType(TypeDTO type){
        if (typeDAO.addType(type)) {
            return true;
        }
        return false;
    }
    public boolean deleteType(int id){
        if (typeDAO.deleteType(id)) {
            return true;
        }
        return false;
    }
    public boolean updateType(TypeDTO type){
        if (typeDAO.updateType(type)) {
            return true;
        }
        return false;
    }
}
