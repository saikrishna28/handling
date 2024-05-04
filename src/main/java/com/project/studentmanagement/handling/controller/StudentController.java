package com.project.studentmanagement.handling.controller;

import com.project.studentmanagement.handling.entity.StudentEntity;
import com.project.studentmanagement.handling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/getAllStudents")
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/addStudent")
    public StudentEntity addStudent (@RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }
}
