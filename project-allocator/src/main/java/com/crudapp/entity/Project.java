package com.crudapp.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Project {
    @Id
    private int id;
    private String projectName;
    private String type;
    private String status;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "id: " + id +
               ", projectName: " + projectName +
               ", type: " + type +
               ", status: " + status +
               ", startDate: " + startDate +
               ", endDate: " + endDate +
               ", address: " + (address != null ? address.toString() : "null");
    }
}

