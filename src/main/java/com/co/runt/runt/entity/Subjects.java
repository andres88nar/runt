
package com.co.runt.runt.entity;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Asignatura")
class Subjects {
    
   @Id
   @Column(name="idAsignatura")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int idSubjects;
   
   @Column(name="nombre")
   private String name;
   
   @ManyToOne
   private Course course;

   @ManyToOne
   private Teacher teacher;
   
   @ManyToMany(targetEntity = Student.class)
   private List<Student> listStudents;
   
   public Subjects() {
   }

    public int getIdSubjects() {
        return idSubjects;
    }

    public void setIdSubjects(int idSubjects) {
        this.idSubjects = idSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Subjects other = (Subjects) obj;
        if (this.idSubjects != other.idSubjects) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        if (!Objects.equals(this.teacher, other.teacher)) {
            return false;
        }
        if (!Objects.equals(this.listStudents, other.listStudents)) {
            return false;
        }
        return true;
    }
   
    @Override
    public String toString() {
        return "Subjects{" + "idSubjects=" + idSubjects + ", name=" + name + ", course=" + course + ", teacher=" + teacher + ", listStudents=" + listStudents + '}';
    }
 
}
