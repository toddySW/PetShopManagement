/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.ProductDAO;
import com.yolo.dto.ProductDTO;
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
public class ProductBLL {
    ProductDAO productDAO = new ProductDAO();
    public ArrayList<ProductDTO> getListProduct(){
        return productDAO.getListProduct();
    }
    public void exportFile(String path){
        try {
            File f = new File(path + "/Product.csv");
            FileWriter w = new FileWriter(f);
            w.write("ID; Name; Description; DateOfManufacture; TypeID; NationID; Price; Images; Status; \n");
            for (ProductDTO productDTO : getListProduct()) {
                w.write(productDTO.getProductID()+";\t"
                        +productDTO.getProductName()+";\t"
                        +productDTO.getDescription()+";\t"
                        +productDTO.getDateOfManufacture()+";\t"
                        +productDTO.getTypeID()+";\t"
                        +productDTO.getNationID()+";\t"
                        +productDTO.getPrice()+";\t"
                        +productDTO.getImages()+";\t"
                        +productDTO.getStatus()+";\n");
            } 
            w.close();  
        } catch (IOException ex) {
            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showProductTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[9];
        for (ProductDTO product : getListProduct()) {
            data[0] = product.getProductID();
            data[1] = product.getProductName();
            data[2] = product.getDescription();
            data[3] = product.getDateOfManufacture();
            data[4] = product.getTypeID();
            data[5] = product.getNationID();
            data[6] = product.getPrice();
            data[7] = product.getImages();
            data[8] = product.getStatus();
            model.addRow(data);
        }
    }
    
    public boolean addProduct(ProductDTO product){
        if (productDAO.addProduct(product)) {
            return true;
        }
        return false;
    }
    public boolean deleteProduct(int id){
        if (productDAO.deleteProduct(id)) {
            return true;
        }
        return false;
    }
    public boolean updateProduct(ProductDTO product){
        if (productDAO.updateProduct(product)) {
            return true;
        }
        return false;
    }
}
