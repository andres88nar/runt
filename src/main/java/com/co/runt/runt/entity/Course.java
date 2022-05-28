package com.co.runt.runt.entity;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Curso")
public class Course {

    @Id
    @Column(name = "idCurso")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idCourse;
    @Column(name = "grado")

    private int grade;
    @Column(name = "salon")
    private String classRoon;

    @ManyToOne
    private School school;

    @OneToMany(targetEntity = Subjects.class)
    private List<Subjects> lisSubjects;

    public Course() {
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassRoon() {
        return classRoon;
    }

    public void setClassRoon(String classRoon) {
        this.classRoon = classRoon;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Subjects> getLisSubjects() {
        return lisSubjects;
    }

    public void setLisSubjects(List<Subjects> lisSubjects) {
        this.lisSubjects = lisSubjects;
    }

    @Override
    public int hashCode() {
        int hash = 1;
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
        final Course other = (Course) obj;
        if (this.idCourse != other.idCourse) {
            return false;
        }
        if (this.grade != other.grade) {
            return false;
        }
        if (!Objects.equals(this.classRoon, other.classRoon)) {
            return false;
        }
        if (!Objects.equals(this.school, other.school)) {
            return false;
        }
        if (!Objects.equals(this.lisSubjects, other.lisSubjects)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Course{" + "idCourse=" + idCourse + ", grade=" + grade + ", classRoon=" + classRoon + ", school=" + school + ", lisSubjects=" + lisSubjects + '}';
    }

}
