/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.yolo.dto.ProductDTO;
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
public class ProductDAO {
    DatabaseServices db = new DatabaseServices();
    
    public ArrayList<ProductDTO> getListProduct(){
        String sql = "SELECT * FROM product LIMIT 5";
        ArrayList<ProductDTO> arr = new ArrayList<ProductDTO>();        
        try {
            Statement st = db.Connection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {       
                ProductDTO product = new ProductDTO();
                product.setProductID(rs.getInt("ProductID"));
                product.setProductName(rs.getString("ProductName"));
                product.setDescription(rs.getString("Description"));
                product.setDateOfManufacture(rs.getDate("DateOfManufacture"));
                product.setTypeID(rs.getString("TypeID"));
                product.setNationID(rs.getString("NationID"));
                product.setPrice(rs.getInt("Price"));
                product.setImages(rs.getString("Images"));
                product.setStatus(rs.getInt("Status"));
                arr.add(product);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
}
