package com.example.ss3_p4.controller;

import com.example.ss3_p4.model.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping()
public class StudentController {
    @GetMapping(value = "/student" , produces = {"application/json", "application/xml"})
    public List<Student> getStudent(){
        return Arrays.asList(
                new Student("SV001", "Nguyen Van A", 8.5),
                new Student("SV002", "Tran Thi B", 7.8),
                new Student("SV003", "Le Van C", 9.1)
        ); 
    }
}
