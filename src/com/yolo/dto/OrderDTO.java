/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dto;

import java.util.Date;

/**
 *
 * @author NGOCHUNG
 */
public class OrderDTO {
    private int OrderID;
    private String OrderDate;
    private int CustomerID;
    private int StaffID;
    private int Status;

    public OrderDTO() {
    }

    public OrderDTO(int OrderID, String OrderDate, int CustomerID, int StaffID, int Status) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.CustomerID = CustomerID;
        this.StaffID = StaffID;
        this.Status = Status;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getStaffID() {
        return StaffID;
    }

    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }


}
