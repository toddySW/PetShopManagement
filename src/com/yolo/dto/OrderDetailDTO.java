/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dto;

/**
 *
 * @author NGOCHUNG
 */
public class OrderDetailDTO {
    private int OrderID;
    private int ProductID;
    private int Quanlity;
    private int Status;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int OrderID, int ProductID, int Quanlity, int Status) {
        this.OrderID = OrderID;
        this.ProductID = ProductID;
        this.Quanlity = Quanlity;
        this.Status = Status;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getQuanlity() {
        return Quanlity;
    }

    public void setQuanlity(int Quanlity) {
        this.Quanlity = Quanlity;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
}
