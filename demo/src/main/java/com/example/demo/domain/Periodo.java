package com.example.demo.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Entity
public class Periodo {
    String code;
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public Periodo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Periodo(){}
}
