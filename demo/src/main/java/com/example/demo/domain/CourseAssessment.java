package com.example.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class CourseAssessment{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
long Id;
String title;

@OneToOne(cascade = CascadeType.ALL)
Periodo periodo;
@OneToOne(cascade = CascadeType.ALL)
Course course;

String tipoNota;
String numNota;
String nomenclatura;
public long getId() {
    return Id;
}
public void setId(long id) {
    Id = id;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public Periodo getPeriodo() {
    return periodo;
}
public void setPeriodo(Periodo periodo) {
    this.periodo = periodo;
}
public Course getCourse() {
    return course;
}
public void setCourse(Course course) {
    this.course = course;
}
public String getTipoNota() {
    return tipoNota;
}
public void setTipoNota(String tipoNota) {
    this.tipoNota = tipoNota;
}
public String getNumNota() {
    return numNota;
}
public void setNumNota(String numNota) {
    this.numNota = numNota;
}
public String getNomenclatura() {
    return nomenclatura;
}
public void setNomenclatura(String nomenclatura) {
    this.nomenclatura = nomenclatura;
}
public CourseAssessment(String title, Periodo periodo, Course course, String tipoNota, String numNota,
        String nomenclatura) {
    this.title = title;
    this.periodo = periodo;
    this.course = course;
    this.tipoNota = tipoNota;
    this.numNota = numNota;
    this.nomenclatura = nomenclatura;
}
public CourseAssessment(){}


}