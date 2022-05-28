
package com.co.runt.runt.entity;

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
public class Teacher {
    
   @Id
   @Column(name="idProfesor")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int idTechar; 
   
   @Column(name="nombre")
   private String name;
   
   @OneToMany(targetEntity = Subjects.class)
   private List<Subjects> lisSubjects;

    public Teacher() {
    }

    public int getIdTechar() {
        return idTechar;
    }

    public void setIdTechar(int idTechar) {
        this.idTechar = idTechar;
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
        return "Techar{" + "idTechar=" + idTechar + ", name=" + name + ", lisSubjects=" + lisSubjects + '}';
    }
   
    }
