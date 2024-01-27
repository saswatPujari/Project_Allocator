package com.crudapp.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private int id;
    private String userName;
    private String email;
    private Long phone;
    private String job;
    private String status;
    private Double cost;
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
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
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
               ", userName: " + userName +
               ", email: " + email +
               ", phone: " + phone +
               ", job: " + job +
               ", status: " + status +
               ", cost: " + cost +
               ", address: " + (address != null ? address.toString() : "null");
    }
}

