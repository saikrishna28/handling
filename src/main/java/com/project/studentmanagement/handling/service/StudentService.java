package com.project.studentmanagement.handling.service;

import com.project.studentmanagement.handling.dto.Marks;
import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.entity.MarksEntity;
import com.project.studentmanagement.handling.entity.StudentEntity;
import com.project.studentmanagement.handling.repository.MarksRepository;
import com.project.studentmanagement.handling.repository.StudentRepository;
import com.project.studentmanagement.handling.transformers.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    MarksService marksService;

    public List<Student> getAllStudents() {
        return studentRepo.findAll().stream().map(StudentTransformer::toDto).collect(Collectors.toList());
    }

    public Student saveStudent(Student student) {
       return StudentTransformer.toDto(studentRepo.save(StudentTransformer.toEntity(student)));
    }

    public void deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
    }

    public Student getStudent(Integer studentId) {
        return studentRepo.findById(studentId).map(StudentTransformer::toDto).orElse(null);
    }

    public Student getStudentWithMarks(Integer studentId) {
        List<Marks> marksByStudentId = marksService.getStudentMarks(studentId);
        Student student = studentRepo.findById(studentId).map(StudentTransformer::toDto).orElse(null);
        if (student != null && !marksByStudentId.isEmpty()) {
            student.setMarks(marksByStudentId);
        }
        return student;
    }
}
