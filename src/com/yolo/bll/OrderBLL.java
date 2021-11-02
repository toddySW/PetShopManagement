/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.OrderDAO;
import com.yolo.dto.CustomerDTO;
import com.yolo.dto.OrderDTO;
import com.yolo.dto.OrderDetailDTO;
import com.yolo.dto.ProductDTO;
import com.yolo.dto.StaffDTO;
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
    
    CustomerBLL customerBLL = new CustomerBLL();
    StaffBLL staffBLL = new StaffBLL();
    ProductBLL productBLL = new ProductBLL();
    public ArrayList<CustomerDTO> listCustomer = customerBLL.getListCustomer();
    public ArrayList<StaffDTO> listStaff = staffBLL.getListStaff();
    public ArrayList<ProductDTO> listProduct = productBLL.getListProduct();
    
    public void showOrderTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[6];
        for (OrderDTO order : getListOrder()) {
            data[0] = order.getOrderID();
            data[1] = order.getOrderDate();
            int cid = order.getCustomerID();
            for (CustomerDTO customerDTO : listCustomer) {
                int id = customerDTO.getCustomerID();
                if (cid == id) {
                    data[2] = customerDTO.getCustomerName();
                }
            }
            int sid = order.getStaffID();
            for (StaffDTO customerDTO : listStaff) {
                int id = customerDTO.getStaffID();
                if (sid == id) {
                    data[3] = customerDTO.getStaffName();
                }
            }
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
            data[0] = orderD.getProductID();
            int pid = orderD.getProductID();
            for (ProductDTO productDTO : listProduct) {
                int xid = productDTO.getProductID();
                if (pid == xid) {
                    data[1] = productDTO.getProductName();
                }
            }
            data[2] = orderD.getQuanlity();
            data[3] = orderD.getStatus();
            model.addRow(data);
        }
    }

    public boolean updateOrderDetail(OrderDetailDTO orderDetailDTO) {
        return orderDAO.updateOrderDetail(orderDetailDTO);
    }
    public boolean deleteOrderDetail(OrderDetailDTO orderDetailDTO) {
        return orderDAO.deleteOrderDetail(orderDetailDTO);
    }
    public boolean dOrdder(int id){
        return orderDAO.dOrder(id);
    }
}

