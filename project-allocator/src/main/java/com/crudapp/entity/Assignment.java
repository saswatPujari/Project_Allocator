package com.crudapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Assignment {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    @ManyToOne
    @JoinColumn(name = "DEVICE_ID")
    private Device device;
    private Date startDate;
    private Date finishDate;
    private Double cost;

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Device getDevice() {
        return device;
    }
    public void setDevice(Device device) {
        this.device = device;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "id: " + id +
               ", project: " + (project != null ? project.toString() : "null") +
               ", user: " + (user != null ? user.toString() : "null") +
               ", device: " + (device != null ? device.toString() : "null") +
               ", startDate: " + startDate +
               ", finishDate: " + finishDate +
               ", cost: " + cost;
    }
}

