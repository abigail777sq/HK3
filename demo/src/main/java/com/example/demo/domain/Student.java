package com.example.demo.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Entity
public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 Long Id;
 String name;
 String email;
 String code;
public Long getId() {
    return Id;
}
public void setId(Long id) {
    Id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getCode() {
    return code;
}
public void setCode(String code) {
    this.code = code;
}
public Student(String name, String email, String code) {
    this.name = name;
    this.email = email;
    this.code = code;
}

 public Student(){};
    
}
