
package com.co.runt.school.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Profesor")
public class Teacher implements Serializable{
      
   private static final long  serialVersionUID = 1L;  
    
   @Id
   @Column(name="idProfesor")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int idTeacher; 
   
   @Column(name="nombre")
   private String name;
   
   @OneToMany(mappedBy = "teacher")
   @JsonManagedReference   
   private List<Subjects> lisSubjects;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }
    
    public int getIdTechar() {
        return idTeacher;
    }

    public void setIdTechar(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subjects> getLisSubjects() {
        return lisSubjects;
    }

    public void setLisSubjects(List<Subjects> lisSubjects) {
        this.lisSubjects = lisSubjects;
    }

    @Override
    public String toString() {
        return "Teacher{" + "idTeacher=" + idTeacher + ", name=" + name + ", lisSubjects=" + lisSubjects + '}';
    }
   
 }
