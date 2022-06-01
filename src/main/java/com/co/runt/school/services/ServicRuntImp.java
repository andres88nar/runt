package com.co.runt.school.services;

import com.co.runt.school.entity.*;
import com.co.runt.school.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicRuntImp implements ServicRunt {

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
    public List<Student> AllStudents() {
        return (List<Student>) studentReposotory.findAll();
    }

    @Override
    public List<Teacher> allTeacher() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public List<Course> allCourses() {
        System.out.println("piroboo");
        
        List<Course> allCourses = (List<Course>) courseReposotory.findAll();
        for(Course course: allCourses){
         // course.setSchool(school);
           // System.out.println("course "+ course.getSchool().getIdSchool());
                 
        }
        return allCourses;
    }

    @Override
    public List<Subjects> allSubjects() {
        return  (List<Subjects>) subjectsRepository.findAll();

    }
    
    
    

}
