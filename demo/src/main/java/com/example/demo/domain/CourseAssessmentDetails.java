package com.example.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity

public class CourseAssessmentDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long Id;

    String score;
    String section;
    @OneToOne(cascade = CascadeType.ALL)
    Student student;
    @OneToOne(cascade = CascadeType.ALL)
    Professor professor;
    @OneToOne(cascade = CascadeType.ALL)

    CourseAssessment courseAssessment;
    String sectionGroup;
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public CourseAssessment getCourseAssessment() {
        return courseAssessment;
    }
    public void setCourseAssessment(CourseAssessment courseAssessment) {
        this.courseAssessment = courseAssessment;
    }
    public String getSectionGroup() {
        return sectionGroup;
    }
    public void setSectionGroup(String sectionGroup) {
        this.sectionGroup = sectionGroup;
    }
    public CourseAssessmentDetails(String score, String section, Student student, Professor professor,
            CourseAssessment courseAssessment, String sectionGroup) {
        this.score = score;
        this.section = section;
        this.student = student;
        this.professor = professor;
        this.courseAssessment = courseAssessment;
        this.sectionGroup = sectionGroup;
    }

    public CourseAssessmentDetails(){}
}
