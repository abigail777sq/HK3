package com.example.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String Name;
    Integer credits;
    String code;
    String HRGroup;
    Integer cycle;
    @OneToOne(cascade = CascadeType.ALL)
    CourseType CourseType;
    
    String VRGroup;

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Integer getCredits() {
        return credits;
    }
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getHRGroup() {
        return HRGroup;
    }
    public void setHRGroup(String hRGroup) {
        HRGroup = hRGroup;
    }
    public Integer getCycle() {
        return cycle;
    }
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }
    public CourseType getCourseType() {
        return CourseType;
    }
    public void setCourseType(CourseType courseType) {
        CourseType = courseType;
    }
    public String getVRGroup() {
        return VRGroup;
    }
    public void setVRGroup(String vRGroup) {
        VRGroup = vRGroup;
    }
    public Course(String name, Integer credits, String code, String hRGroup, Integer cycle,
            CourseType courseType, String vRGroup) {
        Name = name;
        this.credits = credits;
        this.code = code;
        HRGroup = hRGroup;
        this.cycle = cycle;
        CourseType = courseType;
        VRGroup = vRGroup;
    }
    public Course(){}
    
}