/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.StaffDAO;
import com.yolo.dto.StaffDTO;
import com.yolo.gui.Login_GUI;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOCHUNG
 */
public class StaffBLL {
    StaffDAO staffDAO = new StaffDAO();
    public ArrayList<StaffDTO> getListStaff(){
        return staffDAO.getListStaff();
    }
    public void exportFile(String path){
        try {
            File f = new File(path + "/Staff.csv");
            FileWriter w = new FileWriter(f);
            w.write("StaffID; StaffName; DateOfBirth; Gender; Address; Phone; Image; Email; UserName; Status; Role \n");
            for (StaffDTO staffDTO : getListStaff()) {
                w.write(staffDTO.getStaffID()+";\t"
                        +staffDTO.getStaffName()+";\t"
                        +staffDTO.getDateOfBirth()+";\t"
                        +staffDTO.isGender()+";\t"
                        +staffDTO.getAddress()+";\t"
                        +staffDTO.getPhone()+";\t"
                        +staffDTO.getImage()+";\t"
                        +staffDTO.getEmail()+";\t"
                        +staffDTO.getUserName()+";\t"
                        +staffDTO.getStatus()+";\t"
                        +staffDTO.getRole()+";\n");
            } 
            w.close();  
        } catch (IOException ex) {
            Logger.getLogger(StaffBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showStaffTable(DefaultTableModel model){
        model.setRowCount(0);
        Object data[] = new Object[12];
        for (StaffDTO staff : getListStaff()) {
            data[0] = staff.getStaffID();
            data[1] = staff.getStaffName();
            data[2] = staff.getDateOfBirth();
            data[3] = staff.isGender();
            data[4] = staff.getAddress();
            data[5] = staff.getPhone();
            data[6] = staff.getImage();
            data[7] = staff.getEmail();
            data[8] = staff.getUserName();
            data[9] = staff.getPassWord();
            data[10] = staff.getStatus();
            data[11] = staff.getRole();
            model.addRow(data);
        }
    }
    
    public boolean login(String userName, String passWord){
        boolean flag = false;
        // ki???m tra k?? t??? ?????c bi???t
        if (!userName.matches("[a-zA-Z0-9]+") || !passWord.matches("[a-zA-Z0-9]+")) { 
            JOptionPane.showMessageDialog(new Login_GUI(), "Vui l??ng ki???m tra l???i TK vs MK");
        } else {
            flag = staffDAO.login(userName, passWord);
            if(!flag) JOptionPane.showMessageDialog(new Login_GUI(), "TK ho???c MK sai");
        }
        return flag;
    }
    
    public void quenMatKhau(String userNameOrEmail) throws UnsupportedEncodingException{
        try {
            String email = "";
            String pass = "";
            if(!userNameOrEmail.matches("[a-zA-Z0-9]+")){
                String[] obj = staffDAO.quenMKEmail(userNameOrEmail);
                email = obj[0];
                pass = obj[1];
                
            }
            else {
                String[] obj = staffDAO.quenMKUserName(userNameOrEmail);
                email = obj[0];
                pass = obj[1];
            }
            String accountName = "g3petshop@gmail.com";
            String accountPassword = "umbala@000";
            String from = "admin";
            String to = email;
            String body = "M???t kh???u c???a b???n l??: " + pass;
            String subject = "L???y l???i m???t kh???u - PetShopManagement";
            
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", 587);
            
            Session s = Session.getInstance(p,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(accountName, accountPassword);
                        }
                    });
            
            Message msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(accountName, "PetShop"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setText(body);
            
            Transport.send(msg);
            
            JOptionPane.showMessageDialog(new Login_GUI(), "Password ???? g???i v??? Email");
        } catch (MessagingException ex) {
            Logger.getLogger(StaffBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean addStaff(StaffDTO staffDTO){
        return staffDAO.addStaff(staffDTO);
    }
    public boolean updateStaff(StaffDTO staffDTO){
        return staffDAO.updateStaff(staffDTO);
    }
    public boolean deleteStaff(int id){
        return staffDAO.deleteStaff(id);
    }
}
