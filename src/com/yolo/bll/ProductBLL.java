/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.ProductDAO;
import com.yolo.dto.NationDTO;
import com.yolo.dto.ProductDTO;
import com.yolo.dto.TypeDTO;
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
    NationBLL nationBLL = new NationBLL();
    ArrayList<NationDTO> listNation = nationBLL.getListNation();
    TypeBLL typeBLL = new TypeBLL();
    ArrayList<TypeDTO> listType = typeBLL.getListType();
    public ArrayList<ProductDTO> getListProduct(){
        return productDAO.getListProduct();
    }
    public void exportFile(String path){
        try {
            File f = new File(path + "/Product.csv");
            FileWriter w = new FileWriter(f);
            w.write("ID; Name; Description; DateOfManufacture; TypeID; NationID; Price \n");
            for (ProductDTO productDTO : getListProduct()) {
                w.write(productDTO.getProductID()+";\t"
                        +productDTO.getProductName()+";\t"
                        +productDTO.getDescription()+";\t"
                        +productDTO.getDateOfManufacture()+";\t"
                        +productDTO.getTypeID()+";\t"
                        +productDTO.getNationID()+";\t"
                        +productDTO.getPrice()+";\n");

            } 
            w.close();  
        } catch (IOException ex) {
            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showProductTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[7];
        for (ProductDTO product : getListProduct()) {
            data[0] = product.getProductID();
            data[1] = product.getProductName();
            data[2] = product.getDescription();
            data[3] = product.getDateOfManufacture();
            int tid = Integer.parseInt(product.getTypeID());
            for (TypeDTO typeDTO : listType) {
                int id = typeDTO.getTypeID();
                if (tid == id) {
                    data[4] = typeDTO.getTypeName();
                }
                
            }
            
            String nid = product.getNationID();
            for (NationDTO nationDTO : listNation) {
                String id = nationDTO.getNationID();
                if (nid == null ? id == null : nid.equals(id)) {
                    data[5] = nationDTO.getNationName();
                }
                
            }
            
            data[6] = product.getPrice();
            model.addRow(data);
        }
        
    }
    
    public boolean addProduct(ProductDTO product){
        return productDAO.addProduct(product);
    }
    public boolean deleteProduct(int id){
        return productDAO.deleteProduct(id);
    }
    public boolean updateProduct(ProductDTO product){
        return productDAO.updateProduct(product);
    }
}
