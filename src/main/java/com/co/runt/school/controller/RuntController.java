
package com.co.runt.school.controller;


import com.co.runt.school.entity.Course;
import com.co.runt.school.entity.Student;
import com.co.runt.school.entity.Subjects;
import com.co.runt.school.entity.Teacher;
import com.co.runt.school.services.ServicRunt;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("runt-rest/")
public class RuntController {

    @Autowired
    ServicRunt servicRunt;  
    
    
    @PostMapping(value = "allTeacher", produces = MediaType.APPLICATION_JSON_VALUE)
    public List <Teacher> allTeacher(){
      return servicRunt.allTeacher();
    }  
    
     
    @PostMapping(value = "allStuden", produces = MediaType.APPLICATION_JSON_VALUE)
    public List <Student> allStudent(){        
      return servicRunt.AllStudents();
    }  
    
    @PostMapping(value = "allCourse", produces = MediaType.APPLICATION_JSON_VALUE)
    public List <Course> allCourse(){          
      return servicRunt.allCourses();
    }   
    
    @PostMapping(value = "allSubjects", produces = MediaType.APPLICATION_JSON_VALUE)
    public List <Subjects> allSubjects(){          
      return servicRunt.allSubjects();
    } 
    
    
}
