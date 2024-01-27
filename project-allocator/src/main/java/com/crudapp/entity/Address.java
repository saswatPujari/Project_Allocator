package com.crudapp.entity;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    @Override
    public String toString() {
        return "id: " + id +
               ", street: " + street +
               ", city: " + city +
               ", state: " + state +
               ", country: " + country +
               ", zipCode: " + zipCode;
    }
}
