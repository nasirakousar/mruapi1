package com.example.mruapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mruapi.model.Student;
import com.example.mruapi.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    

    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
}