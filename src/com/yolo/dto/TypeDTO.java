/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.dto;

/**
 *
 * @author NGOCHUNG
 */
public class TypeDTO {
    private int typeID;
    private String typeName;
    private int Status;

    public TypeDTO() {
    }

    public TypeDTO(int typeID, String typeName, int Status) {
        this.typeID = typeID;
        this.typeName = typeName;
        this.Status = Status;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
}
