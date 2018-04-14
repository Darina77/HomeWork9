package com.myapp.controllers;

import com.myapp.data.entities.Student;
import com.myapp.services.interfaces.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public  @ResponseBody
    Student addStudent(@RequestBody Student student){
        System.out.println(student);
        return studentsService.addStudent(student);
    }
}
