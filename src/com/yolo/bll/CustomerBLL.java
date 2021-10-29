/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.CustomerDAO;
import com.yolo.dto.CustomerDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOCHUNG
 */
public class CustomerBLL {
    CustomerDAO customerDAO = new CustomerDAO();
    public ArrayList<CustomerDTO> getListCustomer(){
        return customerDAO.getListCustomer();
    }
    
    public void showCustomerTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[11];
        for (CustomerDTO customer : getListCustomer()) {
            data[0] = customer.getCustomerID();
            data[1] = customer.getCustomerName();
            data[2] = customer.getTaxCode();
            data[3] = customer.getPhone();
            data[4] = customer.getAddress();
            data[5] = customer.getRepresentative();
            data[6] = customer.getEmail();
            data[7] = customer.getUserName();
            data[8] = customer.getPassWord();
            data[9] = customer.getStatus();
            data[10] = customer.getRole();
            model.addRow(data);
        }
    }
}
