/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.CustomerDTO;
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
public class CustomerDAO {
    DatabaseServices db = new DatabaseServices();
    
    public ArrayList<CustomerDTO> getListCustomer(){
        String sql = "SELECT * FROM customer";
        ArrayList<CustomerDTO> arr = new ArrayList<CustomerDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                CustomerDTO customer = new CustomerDTO();
                customer.setCustomerID(rs.getInt("CustomerID"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setUserName(rs.getString("UserName"));
                customer.setTaxCode(rs.getString("TaxCode"));
                customer.setPhone(rs.getString("Phone"));
                customer.setAddress(rs.getString("Address"));
                customer.setRepresentative(rs.getString("Representative"));
                customer.setEmail(rs.getString("Email"));
                customer.setPassWord(rs.getString("PassWord"));
                customer.setStatus(rs.getInt("Status"));
                customer.setRole(rs.getInt("Role"));
                arr.add(customer);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
}
