package com.example.mruapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mruapi.model.Student;

@Service
public class StudentService {
 
    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Nasira", "IT"));
        students.add(new Student(2, "Rahul", "CSE"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }
}