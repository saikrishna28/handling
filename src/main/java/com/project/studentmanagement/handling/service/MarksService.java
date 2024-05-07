package com.project.studentmanagement.handling.service;

import com.project.studentmanagement.handling.dto.Marks;
import com.project.studentmanagement.handling.dto.Student;
import com.project.studentmanagement.handling.entity.MarksEntity;
import com.project.studentmanagement.handling.repository.MarksRepository;
import com.project.studentmanagement.handling.transformers.MarksTransformer;
import com.project.studentmanagement.handling.transformers.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarksService {
    
    @Autowired
    MarksRepository marksRepository;

    public List<Marks> saveStudentMarks(List<Marks> marks) {
        return MarksTransformer.toDtoList(marksRepository.saveAll(marks.stream().map(MarksTransformer::toEntity).toList()));
    }

    public List<Marks> getStudentMarks(Integer studentId) {
        return marksRepository.findByStudentId(studentId).stream().map(MarksTransformer::toDto).collect(Collectors.toList());
    }
}
