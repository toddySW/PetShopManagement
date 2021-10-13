package com.yolo.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGOCHUNG
 */
public class CustomerDTO {
    private int CustomerID;
    private String CustomerName;
    private String TaxCode;
    private String Phone;
    private String Address;
    private String Representative;
    private String Email;
    private String UserName;
    private String PassWord;
    private int Status;
    private int Role;  

    public CustomerDTO() {
    }

    public CustomerDTO(int CustomerID, String CustomerName, String TaxCode, String Phone, String Address, String Representative, String Email, String UserName, String PassWord, int Status, int Role) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.TaxCode = TaxCode;
        this.Phone = Phone;
        this.Address = Address;
        this.Representative = Representative;
        this.Email = Email;
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.Status = Status;
        this.Role = Role;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getTaxCode() {
        return TaxCode;
    }

    public void setTaxCode(String TaxCode) {
        this.TaxCode = TaxCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getRepresentative() {
        return Representative;
    }

    public void setRepresentative(String Representative) {
        this.Representative = Representative;
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
