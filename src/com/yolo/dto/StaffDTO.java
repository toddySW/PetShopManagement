/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dto;

import java.util.Date;

/**
 *
 * @author NGOCHUNG
 */
public class StaffDTO {
    private int StaffID;
    private String StaffName;
    private Date DateOfBirth;
    private boolean Gender;  
    private String Address;
    private String Phone;
    private String Image;
    private String Email;
    private String UserName;
    private String PassWord;
    private int Status;
    private int Role;  

    public StaffDTO() {
    }

    public StaffDTO(int StaffID, String StaffName, Date DateOfBirth, boolean Gender, String Address, String Phone, String Image, String Email, String UserName, String PassWord, int Status, int Role) {
        this.StaffID = StaffID;
        this.StaffName = StaffName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Address = Address;
        this.Phone = Phone;
        this.Image = Image;
        this.Email = Email;
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.Status = Status;
        this.Role = Role;
    }

    public int getStaffID() {
        return StaffID;
    }

    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String StaffName) {
        this.StaffName = StaffName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }
    
}
