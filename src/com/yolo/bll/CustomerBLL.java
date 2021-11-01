/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.CustomerDAO;
import com.yolo.dto.CustomerDTO;
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
public class CustomerBLL {
    CustomerDAO customerDAO = new CustomerDAO();
    public ArrayList<CustomerDTO> getListCustomer(){
        return customerDAO.getListCustomer();
    }
    public void exportFile(String path){
        try {
            File f = new File(path + "/Customer.csv");
            FileWriter w = new FileWriter(f);
            w.write("CustomerID; CustomerName; Phone; Address; Email; UserName\n");
            for (CustomerDTO customerDTO : getListCustomer()) {
                w.write(customerDTO.getCustomerID()+";\t"
                        +customerDTO.getCustomerName()+";\t"
                        +customerDTO.getPhone()+";\t"
                        +customerDTO.getAddress()+";\t"
                        +customerDTO.getEmail()+";\t"
                        +customerDTO.getUserName()+";\n");
            } 
            w.close();  
        } catch (IOException ex) {
            Logger.getLogger(CustomerBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showCustomerTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[6];
        for (CustomerDTO customer : getListCustomer()) {
            data[0] = customer.getCustomerID();
            data[1] = customer.getCustomerName();
            data[2] = customer.getPhone();
            data[3] = customer.getAddress();
            data[4] = customer.getEmail();
            data[5] = customer.getUserName();
            model.addRow(data);
        }
    }
    
    public boolean updateCustomer(CustomerDTO customer){
        return customerDAO.updateCustomer(customer);
    }
    public boolean deleteCustomer(int id){
        return customerDAO.deleteCustomer(id);
    }
}
