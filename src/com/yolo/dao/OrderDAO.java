/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.OrderDTO;
import com.yolo.dto.OrderDetailDTO;
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
public class OrderDAO {
    DatabaseServices db = new DatabaseServices();
    
    public ArrayList<OrderDTO> getListOrder(){
        String sql = "SELECT * FROM Orderpro where status != 1";
        ArrayList<OrderDTO> arr = new ArrayList<OrderDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                OrderDTO order = new OrderDTO();
                order.setOrderID(rs.getInt("OrderID"));
                order.setOrderDate(rs.getString("OrderDate"));
                order.setCustomerID(rs.getInt("CustomerID"));
                order.setStaffID(rs.getInt("StaffID"));
                order.setStatus(rs.getInt("Status"));
                arr.add(order);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    public ArrayList<OrderDetailDTO> getListOrderDetail(int id){
        String sql = "SELECT * FROM OrderDetail where OrderID = " + id;
        ArrayList<OrderDetailDTO> arr = new ArrayList<OrderDetailDTO>();        
        try {
            Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(sql);    
            while (rs.next()) {       
                OrderDetailDTO orderDetail = new OrderDetailDTO();
                orderDetail.setOrderID(rs.getInt("OrderID"));
                orderDetail.setProductID(rs.getInt("ProductID"));
                orderDetail.setQuanlity(rs.getInt("Quantity"));
                orderDetail.setStatus(rs.getInt("Status"));
                arr.add(orderDetail);  
            }
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public boolean deleteOrder(int id) {
        String sql = "UPDATE orderpro SET status = 1 WHERE orderid = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean dOrder(int id) {
        String sql = "DELETE FROM `orderpro` WHERE orderID = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean updateOrder(OrderDTO order) {
        String sql = "UPDATE `orderpro` SET "
                + "`staffID` = ?, "
                + "`customerID` = ?, "
                + "`Status` = ? "
                + "WHERE `orderID` = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, order.getStaffID());
            st.setInt(2, order.getCustomerID());
            st.setInt(3, order.getStatus());
            st.setInt(4, order.getOrderID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        return true;
    }
    public boolean updateOrderDetail(OrderDetailDTO orderDetailDTO) {
        String sql = "UPDATE `orderdetail` SET "
                + "`quantity` = ? "
                + "WHERE `orderID` = ? and productid = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, orderDetailDTO.getQuanlity());
            st.setInt(2, orderDetailDTO.getOrderID());
            st.setInt(3, orderDetailDTO.getProductID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        return true;
    }
    
    public boolean deleteOrderDetail(OrderDetailDTO orderDetailDTO) {
        String sql = "DELETE FROM `orderdetail` WHERE `ProductID` = ? and orderID = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(2, orderDetailDTO.getOrderID());
            st.setInt(1, orderDetailDTO.getProductID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        return true;
    }
}
