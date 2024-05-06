package com.project.studentmanagement.handling.service;

import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.entity.StudentEntity;
import com.project.studentmanagement.handling.repository.StudentRepository;
import com.project.studentmanagement.handling.transformers.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll().stream().map(StudentTransformer::toDto).collect(Collectors.toList());
    }

    public Student saveStudent(Student student) {
       return StudentTransformer.toDto(studentRepo.save(StudentTransformer.toEntity(student)));
    }
}
