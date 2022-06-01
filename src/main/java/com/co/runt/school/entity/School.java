package com.co.runt.school.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Escuela")
public class School implements Serializable{

    private static final long  serialVersionUID = 1L; 
    
    @Id
    @Column(name = "idEscuela")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSchool;

    @Column(name = "nombre")
    private String name;

    @OneToMany(targetEntity = Course.class, mappedBy = "school")   
    private List<Course> courses;

    public School() {
    }

    public School(String name, List<Course> courses) {
        this.name = name;
        this.courses=courses;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final School other = (School) obj;
        if (this.idSchool != other.idSchool) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.courses, other.courses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "School{" + "idSchool=" + idSchool + ", name=" + name + ", courses=" + courses + '}';
    }

}
