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
public class NationDTO {
   private String nationID;
   private String nationName;
   private int Status;

    public NationDTO() {
    }
       
    public NationDTO(String nationID, String nationName, int Status) {
        this.nationID = nationID;
        this.nationName = nationName;
        this.Status = Status;
    }

    public String getNationID() {
        return nationID;
    }

    public void setNationID(String nationID) {
        this.nationID = nationID;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

}
