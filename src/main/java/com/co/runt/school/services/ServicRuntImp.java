
package com.co.runt.school.services;

import com.co.runt.school.entity.*;
import com.co.runt.school.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicRuntImp implements ServicRunt{

    @Autowired
    private CourseReposotory courseReposotory;

    @Autowired
    private SchoolRepository schoolRepository;
           
    @Autowired
    private StudentReposotory studentReposotory;
           
    @Autowired
    private SubjectsRepository subjectsRepository;
              
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public void saveCouse(Course course) {
        courseReposotory.save(course);
    }

    @Override
    public void saveTeacher(Teacher teather) {
        teacherRepository.save(teather);
    }

    @Override
    public void saveStudent(Student student) {
       studentReposotory.save(student);
    }

    @Override
    public void saveSubject(Subjects subject) {
       subjectsRepository.save(subject);
    }
    
    @Override
    public List<Student> AllStudents(){
      return (List<Student>) studentReposotory.findAll();
    }
    
    @Override
    @Transactional
    public void searchTeacher(Teacher teather){
     
//        
//        Teacher d=    teacherRepository.findById(teather.getIdTechar()).orElse(null);
//      
//        System.out.println("desde acaaaaa "+teather);
//        
//        
//        System.out.println("desde acaaaaa "+d);
    }
    
    
}
