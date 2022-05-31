package com.co.runt.school.entity;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class Student {

    @Id
    @Column(name = "idEstudiante")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int isStudent;

    @Column(name = "Nombre")
    private String name;

    @ManyToMany(targetEntity = Subjects.class)
    private List<Subjects> lisSubjects;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    
    public int getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(int isStudent) {
        this.isStudent = isStudent;
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
    public int hashCode() {
        int hash = 3;
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
        final Student other = (Student) obj;
        if (this.isStudent != other.isStudent) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lisSubjects, other.lisSubjects)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Student{" + "isStudent=" + isStudent + ", name=" + name + ", lisSubjects=" + lisSubjects + '}';
    }

}
