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

    @GetMapping("/getStudent/{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping("/getStudentWithMarks/{studentId}")
    public Student getStudentWithMarks(@PathVariable Integer studentId) {
        return studentService.getStudentWithMarks(studentId);
    }

    @PutMapping("/addStudent")
    public Student addStudent (@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping(value = "/updateStudent", consumes="application/json")
    public Student updateStudent (@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public void deleteStudent (@PathVariable Integer studentId) {
        studentService.deleteStudent(studentId);
    }

}
