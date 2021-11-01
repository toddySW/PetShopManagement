/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.mysql.jdbc.PreparedStatement;
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
        String sql = "SELECT * FROM customer where status = 0";
        ArrayList<CustomerDTO> arr = new ArrayList<CustomerDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                CustomerDTO customer = new CustomerDTO();
                customer.setCustomerID(rs.getInt("CustomerID"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setUserName(rs.getString("UserName"));
                customer.setPhone(rs.getString("Phone"));
                customer.setAddress(rs.getString("Address"));
                customer.setEmail(rs.getString("Email"));
                arr.add(customer);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public boolean updateCustomer(CustomerDTO customer) {
        String sql = "update `customer` set "
                + "`CustomerName` = ?, "
                + "`Phone` = ?, "
                + "`Address` = ?, "
                + "`Email` = ? "
                + "where customerid = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setString(1, customer.getCustomerName());
            st.setString(2, customer.getPhone());
            st.setString(3, customer.getAddress());
            st.setString(4, customer.getEmail());
            st.setInt(5, customer.getCustomerID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean deleteCustomer(int id) {
        String sql = "UPDATE customer SET status = 1 WHERE customerid = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
}
