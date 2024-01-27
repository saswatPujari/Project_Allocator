package com.crudapp.entity;

import javax.persistence.*;

@Entity
public class Device {
    @Id
    private int id;
    private String deviceName;
    private String type;
    private Double cost;
    private int quantity;

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "id: " + id +
               ", deviceName: " + deviceName +
               ", type: " + type +
               ", cost: " + cost +
               ", quantity: " + quantity;
    }
}
