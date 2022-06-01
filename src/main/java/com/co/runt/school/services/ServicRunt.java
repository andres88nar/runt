
package com.co.runt.school.services;

import com.co.runt.school.entity.Course;
import com.co.runt.school.entity.School;
import com.co.runt.school.entity.Student;
import com.co.runt.school.entity.Subjects;
import com.co.runt.school.entity.Teacher;
import java.util.List;


public interface ServicRunt {
    
    public void saveSchool(School school);

    public void saveCouse(Course course);

    public void saveTeacher(Teacher teather);

    public void saveStudent(Student student);

    public void saveSubject(Subjects subject);
 
    public List<Student> AllStudents();
    
    public List<Teacher> allTeacher();

    public List<Course> allCourses();

    public List<Subjects> allSubjects();
    
}
