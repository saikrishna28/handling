package com.project.studentmanagement.handling.repository;

import com.project.studentmanagement.handling.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    StudentEntity findById(int id);
}
