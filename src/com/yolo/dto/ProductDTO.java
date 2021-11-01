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
public class ProductDTO {
    private int ProductID;
    private String ProductName;
    private String Description;
    private Date DateOfManufacture;
    private int TypeID;
    private String nationID;
    private int Price;
    private String Images;
    private int Status;

    public ProductDTO() {
    }

    public ProductDTO(int ProductID, String ProductName, String Description, Date DateOfManufacture, int TypeID, String nationID, int Price, String Images, int Status) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Description = Description;
        this.DateOfManufacture = DateOfManufacture;
        this.TypeID = TypeID;
        this.nationID = nationID;
        this.Price = Price;
        this.Images = Images;
        this.Status = Status;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getDateOfManufacture() {
        return DateOfManufacture;
    }

    public void setDateOfManufacture(Date DateOfManufacture) {
        this.DateOfManufacture = DateOfManufacture;
    }

    public int getTypeID() {
        return TypeID;
    }

    public void setTypeID(int TypeID) {
        this.TypeID = TypeID;
    }

    public String getNationID() {
        return nationID;
    }

    public void setNationID(String nationID) {
        this.nationID = nationID;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getImages() {
        return Images;
    }

    public void setImages(String Images) {
        this.Images = Images;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
