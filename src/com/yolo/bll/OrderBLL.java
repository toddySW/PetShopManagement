/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.OrderDAO;
import com.yolo.dto.OrderDTO;
import com.yolo.dto.OrderDetailDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOCHUNG
 */
public class OrderBLL {
    OrderDAO orderDAO = new OrderDAO();
    public ArrayList<OrderDTO> getListOrder(){
        return orderDAO.getListOrder();
    }
    
    public void showOrderTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[6];
        for (OrderDTO order : getListOrder()) {
            data[0] = order.getOrderID();
            data[1] = order.getOrderDate();  
            data[2] = order.getCustomerID();
            data[3] = order.getStaffID();
            data[4] = order.getStatus();
            model.addRow(data);
        }
    }
    public boolean deleteOrder(int id){
        if (orderDAO.deleteOrder(id)) {
            return true;
        }
        return false;
    }
    public boolean updateOrder(OrderDTO order){
        if (orderDAO.updateOrder(order)) {
            return true;
        }
        return false;
    }
    public ArrayList<OrderDetailDTO> getListOrderDetail(int id){
        return orderDAO.getListOrderDetail(id);
    }
    public void showDetailOrder(DefaultTableModel model, int id) {
        model.setRowCount(0);
        Object data[] = new Object[4];
        for (OrderDetailDTO orderD : getListOrderDetail(id)) {
            data[0] = orderD.getOrderID();
            data[1] = orderD.getProductID();
            data[2] = orderD.getQuanlity();
            data[3] = orderD.getStatus();
            model.addRow(data);
        }
    }
}
