/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.ProductDAO;
import com.yolo.dto.ProductDTO;
import java.util.ArrayList;
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
