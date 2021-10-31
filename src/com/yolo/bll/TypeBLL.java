/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.TypeDAO;
import com.yolo.dto.TypeDTO;
import java.util.ArrayList;
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
    public void showTypeTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[3];
        for (TypeDTO type : getListType()) {
            data[0] = type.getTypeID();
            data[1] = type.getTypeName();           
            data[2] = type.getStatus();
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
