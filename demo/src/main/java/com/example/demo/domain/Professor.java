package com.example.demo.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Entity
public class Professor {
    String name;
    String lastName;
    String email;
    String fullName; 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    public Professor(){}
    public Professor(String name, String lastName, String email, String fullName) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.fullName = fullName;
    }
    //getters and setters
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName(){
        return lastName;

    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getFullName(){
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName=fullName;
    }


}
