package com.project.studentmanagement.handling.controller;

import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.entity.StudentEntity;
import com.project.studentmanagement.handling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/addStudent")
    public Student addStudent (@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping(value = "/updateStudent", consumes="application/json")
    public Student updateStudent (@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

}
