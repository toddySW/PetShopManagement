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
    private final String USERNAME = "QgimTbSdro";
    private final String PASSWORD = "wINMslIpPO";
    private final String DB_NAME = "QgimTbSdro";
    private final String URL = "jdbc:mysql://remotemysql.com:3306/" + DB_NAME;
    public Connection Connection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);       
    }   
}
