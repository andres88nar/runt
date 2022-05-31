
package com.co.runt.school.repository;

import com.co.runt.school.entity.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseReposotory extends CrudRepository<Course, Integer> {
    
}
