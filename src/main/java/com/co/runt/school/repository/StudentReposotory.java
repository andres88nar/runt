
package com.co.runt.school.repository;

import com.co.runt.school.entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentReposotory extends CrudRepository<Student, Integer> {
    
}
