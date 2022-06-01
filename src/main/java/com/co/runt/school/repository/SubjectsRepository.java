
package com.co.runt.school.repository;

import com.co.runt.school.entity.Student;
import com.co.runt.school.entity.Subjects;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SubjectsRepository extends CrudRepository<Subjects, Integer>  { 
    
//    public List <Student> studentforSubjects(int idSubjects){
//        
//        
//     
//    }
    
}
