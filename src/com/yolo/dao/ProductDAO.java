/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import com.mysql.jdbc.PreparedStatement;
import com.yolo.dto.ProductDTO;
import java.sql.Date;
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
        String sql = "SELECT * FROM product";
        ArrayList<ProductDTO> arr = new ArrayList<ProductDTO>();        
        try {
            Statement st = db.Connect().createStatement();
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
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    public boolean addProduct(ProductDTO product) {
        String sql = "INSERT INTO `product`(`ProductName`, `Description`, `DateOfManufacture`, `TypeID`, `nationID`, `Price`, `Images`, `Status`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setString(1, product.getProductName());
            st.setString(2, product.getDescription());
            st.setDate(3, (Date) product.getDateOfManufacture());
            st.setString(4, product.getTypeID());
            st.setString(5, product.getNationID());
            st.setInt(6, product.getPrice());
            st.setString(7, product.getImages());
            st.setInt(8, product.getStatus());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean deleteProduct(int id) {
        String sql = "UPDATE product SET status = 1 WHERE productid =?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean updateProduct(ProductDTO product) {
        String sql = "update `product` set "
                + "`ProductName` = ?, "
                + "`Description` = ?, "
                + "`TypeID` = ?, "
                + "`nationID` = ?, "
                + "`Price` = ?, "
                + "`Status` = ? "
                + "where productid = ?";
        try {
            PreparedStatement st = (PreparedStatement) db.Connect().prepareStatement(sql);
            st.setString(1, product.getProductName());
            st.setString(2, product.getDescription());
            st.setString(3, product.getTypeID());
            st.setString(4, product.getNationID());
            st.setInt(5, product.getPrice());
            st.setInt(6, product.getStatus());
            st.setInt(7, product.getProductID());
            st.executeUpdate();
            st.close();
            db.closeConnect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
