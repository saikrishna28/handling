package com.project.studentmanagement.handling.transformers;

import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.entity.StudentEntity;

public class StudentTransformer {

    public static StudentEntity toEntity (Student student) {
        return StudentEntity.builder()
                .studentId(student.getStudentId())
                .age(student.getAge())
                .email(student.getEmail())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .address(student.getAddress())
                .build();
    }

    public static Student toDto (StudentEntity studentEntity) {
        return Student.builder()
                .studentId(studentEntity.getStudentId())
                .age(studentEntity.getAge())
                .email(studentEntity.getEmail())
                .firstName(studentEntity.getFirstName())
                .lastName(studentEntity.getLastName())
                .address(studentEntity.getAddress())
                .build();
    }
}
