package com.project.studentmanagement.handling.repository;

import com.project.studentmanagement.handling.entity.MarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksRepository extends JpaRepository<MarksEntity, Integer> {
    List<MarksEntity> findByStudentId(Integer studentId);
}
