/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.bll;

import com.yolo.dao.CustomerDAO;
import com.yolo.gui.Login_GUI;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author NGOCHUNG
 */
public class CustomerBLL {
    CustomerDAO customerDAO = new CustomerDAO();
    
    public boolean login(String userName, String passWord){
        boolean flag = false;
        // kiểm tra ký tự đặc biệt
        if (!userName.matches("[a-zA-Z0-9]+") || !passWord.matches("[a-zA-Z0-9]+")) { 
            JOptionPane.showMessageDialog(new Login_GUI(), "Vui lòng kiểm tra lại TK vs MK");
        } else {
            flag = customerDAO.login(userName, passWord);
            if(!flag) JOptionPane.showMessageDialog(new Login_GUI(), "TK hoặc MK sai");
        }
        return flag;
    }
    
//    public void quenMatKhau(String userNameOrEmail){
//        try {
//            String email = "";
//            String pass = "";
//            if(!userNameOrEmail.matches("[a-zA-Z0-9]+")){
//                String[] obj = customerDAO.quenMKEmail(userNameOrEmail);
//                email = obj[0];
//                pass = obj[1];
//                
//            }
//            else {
//                String[] obj = customerDAO.quenMKUserName(userNameOrEmail);
//                email = obj[0];
//                pass = obj[1];
//            }
//            System.out.println(pass);
//            if (pass != null || pass != "") {
//                GmailSender sender = new GmailSender();
//                sender.setSender("g3petshop@gmail.com", "umbala@000");
//                sender.addRecipient(email);
//                sender.setSubject("Đặt lại mật khẩu của bạn - Petshop");
//                sender.setBody("Your password: " + pass);
//                sender.send();
//            }
//            
//            JOptionPane.showMessageDialog(new Login_GUI(), "Password đã gửi về Email");
//        } catch (MessagingException ex) {
//            Logger.getLogger(CustomerBLL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public void quenMatKhau(String userNameOrEmail) throws UnsupportedEncodingException{
        try {
            String email = "";
            String pass = "";
            if(!userNameOrEmail.matches("[a-zA-Z0-9]+")){
                String[] obj = customerDAO.quenMKEmail(userNameOrEmail);
                email = obj[0];
                pass = obj[1];
                
            }
            else {
                String[] obj = customerDAO.quenMKUserName(userNameOrEmail);
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
}
