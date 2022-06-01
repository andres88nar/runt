
package com.co.runt.school.controller;


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
    
    
    
    
    
}
