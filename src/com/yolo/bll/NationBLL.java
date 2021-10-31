/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.NationDAO;
import com.yolo.dto.NationDTO;
import com.yolo.dto.NationDTO;
import java.util.ArrayList;
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
    public void showNationTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[3];
        for (NationDTO nation : getListNation()) {
            data[0] = nation.getNationID();
            data[1] = nation.getNationName();           
            data[2] = nation.getStatus();
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
