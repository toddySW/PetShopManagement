/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author NGOCHUNG
 */
public class DatabaseServices {   
    
    protected final String USERNAME = "ngochung_petshop";
    protected final String PASSWORD = "ngochung_petshop";
    protected final String DB_NAME = "ngochung_petshop";
    protected final String URL = "jdbc:mysql://ngochung.ga:3306/" + DB_NAME;
    public Connection Connection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);       
    }   
}