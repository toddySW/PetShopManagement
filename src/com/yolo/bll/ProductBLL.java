/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.ProductDAO;
import com.yolo.dto.ProductDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOCHUNG
 */
public class ProductBLL {
    ProductDAO productDAO = new ProductDAO();
    public ArrayList<ProductDTO> getListProduct(){
        return productDAO.getListProduct();
    }
    public void showProductTable(JTable t){
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        for (ProductDTO product : getListProduct()) {
            int ProductID = product.getProductID();
            String ProductName = product.getProductName();
            String Description = product.getDescription();
            Date DateOfManufacture = product.getDateOfManufacture();
            String TypeID = product.getTypeID();
            String nationID = product.getNationID();
            int Price = product.getPrice();
            String Images = product.getImages();
            int Status = product.getStatus();
            Object[] obj = {ProductID, ProductName, Description, DateOfManufacture, TypeID, nationID, Price, Images, Status};
            System.out.println(ProductName);
            model.addRow(obj);
        }
    }
}
