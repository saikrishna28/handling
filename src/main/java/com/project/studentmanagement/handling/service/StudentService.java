package com.project.studentmanagement.handling.service;

import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.entity.StudentEntity;
import com.project.studentmanagement.handling.repository.StudentRepository;
import com.project.studentmanagement.handling.transformers.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public List<StudentEntity> getAllStudents() {
        StudentTransformer
        studentRepo.findAll().stream().map(StudentEntity :: StudentTransformer.toDto())
        return studentRepo.findAll();
    }

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }
}
