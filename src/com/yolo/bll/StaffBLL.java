/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.StaffDAO;
import com.yolo.dto.StaffDTO;
import com.yolo.gui.Login_GUI;
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
        // kiểm tra ký tự đặc biệt
        if (!userName.matches("[a-zA-Z0-9]+") || !passWord.matches("[a-zA-Z0-9]+")) { 
            JOptionPane.showMessageDialog(new Login_GUI(), "Vui lòng kiểm tra lại TK vs MK");
        } else {
            flag = staffDAO.login(userName, passWord);
            if(!flag) JOptionPane.showMessageDialog(new Login_GUI(), "TK hoặc MK sai");
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
            String body = pass;
            String subject = "okkkkk";
            
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
            
            JOptionPane.showMessageDialog(new Login_GUI(), "Password đã gửi về Email");
        } catch (MessagingException ex) {
            Logger.getLogger(CustomerBLL.class.getName()).log(Level.SEVERE, null, ex);
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
