
package com.co.runt.school.controller;

import com.co.runt.school.services.ServicRunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("runt-mvc/")
public class RuntConotrollerMVC {
    
    // http://localhost:8080/runt-mvc/
    
    @Autowired
    ServicRunt servicRunt;  
        
    @GetMapping("/") 
    public String starting() {      
         return "Inicio";
    }
    
    @GetMapping("/query") 
    public String consulta(Model model) {
         model.addAttribute("lisTeacher", servicRunt.allTeacher());
         return "Consulta";
    }
    
    
}
