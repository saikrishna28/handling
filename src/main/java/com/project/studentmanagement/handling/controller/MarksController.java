package com.project.studentmanagement.handling.controller;

import com.project.studentmanagement.handling.dto.Marks;
import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.service.MarksService;
import com.project.studentmanagement.handling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarksController {

    @Autowired
    MarksService marksService;
    @GetMapping("/getStudentMarks/{studentId}")
    public List<Marks> getAllStudents(@PathVariable Integer studentId) {
        return marksService.getStudentMarks(studentId);
    }

    @PutMapping("/addStudentMarks")
    public List<Marks> addStudentMarks (@RequestBody List<Marks> studentMarks) {
        return marksService.saveStudentMarks(studentMarks);
    }

}
