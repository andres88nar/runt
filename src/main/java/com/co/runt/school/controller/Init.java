
package com.co.runt.school.controller;

import com.co.runt.school.entity.Course;
import com.co.runt.school.entity.School;
import com.co.runt.school.entity.Student;
import com.co.runt.school.entity.Subjects;
import com.co.runt.school.entity.Teacher;
import com.co.runt.school.services.ServicRunt;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Init {

    @Autowired
    ServicRunt servicRunt;

    @PostConstruct
    private void starting() {
        System.out.println("ALIMENTANDO DB H2");
        
        Teacher nemesis = new Teacher("Némesis");
        Teacher priapo = new Teacher("Príapo");
        Teacher iris = new Teacher("Iris");
                
        Student afrodita = new Student("Afrodita");
        Student apolo = new Student("Apolo");
        Student ares = new Student("Ares");

        Student artemisa = new Student("Artemisa");
        Student atenea = new Student("Atenea");
        Student dionisio = new Student("Dionisio");

        Student hefesto = new Student("Hefesto");
        Student hera = new Student("Hera");

        Student hermes = new Student("Hermes");
        Student hades = new Student("Hades");
        Student poseidon = new Student("Poseidón");
        Student zeus = new Student("Zeus");


        Subjects matematicas = new Subjects("Matematicas", nemesis, servicRunt.AllStudents());
        Subjects español = new Subjects("Español", priapo, new ArrayList<Student>(Arrays.asList(afrodita, apolo, ares, artemisa, atenea, dionisio)));
        Subjects preIcfes = new Subjects("Pre Icfes", nemesis, new ArrayList<Student>(Arrays.asList(hefesto, hera, hermes, hades, poseidon, zeus)));
        Subjects inglesBasico = new Subjects("Ingels Basico", iris, new ArrayList<Student>(Arrays.asList(afrodita, apolo, ares)));
        Subjects inglesAvanzado = new Subjects("Ingles Avanzado", iris, new ArrayList<Student>(Arrays.asList(artemisa, atenea, dionisio)));
        
        Course diezA = new Course(10,"A",new ArrayList <Subjects>(Arrays.asList(matematicas, español, inglesBasico)));
        Course diezB = new Course(10,"B",new ArrayList <Subjects>(Arrays.asList(matematicas, español, inglesAvanzado)));
        Course onceA = new Course(11,"A",new ArrayList <Subjects>(Arrays.asList(matematicas, preIcfes))); 
        Course onceB = new Course(11,"B",new ArrayList <Subjects>(Arrays.asList(matematicas, preIcfes)));
        
        School Olimpo = new School("El colegio del Olimpo",new ArrayList <Course> (Arrays.asList(diezA, diezB, onceA, onceB)));     

        saveTechars(new ArrayList<Teacher>(Arrays.asList(nemesis, priapo, iris)));
        saveStudents(new ArrayList<Student>(Arrays.asList(afrodita, apolo, ares, artemisa, atenea, dionisio, hefesto, hera, hermes, hades, poseidon, zeus)));
        saveSubjects(new ArrayList <Subjects> (Arrays.asList(matematicas, español, preIcfes, inglesBasico, inglesAvanzado)));
        saveCourse(new ArrayList <Course> (Arrays.asList(diezA, diezB, onceA, onceB)));
        servicRunt.saveSchool(Olimpo); 
        
        System.out.println(new Gson().toJson(Olimpo));             

    }

    private void saveTechars(List<Teacher> lisTeachers) {
        for (Teacher teather : lisTeachers) {
            servicRunt.saveTeacher(teather);
        }
    }
    
     private void saveStudents(List<Student> lisStudents) {
       for(Student student:  lisStudents){
          servicRunt.saveStudent(student);
       }    
    }
     
     private void saveSubjects(ArrayList<Subjects> listSubjects) {
        for(Subjects subject: listSubjects){
            servicRunt.saveSubject(subject);
        }
    }

    private void saveCourse(ArrayList<Course> listCourse) {
        for (Course course : listCourse) {
            servicRunt.saveCouse(course);
        }
    }

}
