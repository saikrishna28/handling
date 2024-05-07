package com.project.studentmanagement.handling.transformers;

import com.project.studentmanagement.handling.dto.Marks;
import com.project.studentmanagement.handling.entity.MarksEntity;

import java.util.List;
import java.util.stream.Collectors;

public class MarksTransformer {

    public static MarksEntity toEntity(Marks marks) {
        return MarksEntity.builder()
                .studentId(marks.getStudentId())
                .subject(marks.getSubject())
                .grade(marks.getGrade())
                .marks(marks.getMarks())
                .build();
    }

    public static Marks toDto(MarksEntity marksEntity) {
        return Marks.builder()
                .id(marksEntity.getId())
                .studentId(marksEntity.getStudentId())
                .subject(marksEntity.getSubject())
                .grade(marksEntity.getGrade())
                .marks(marksEntity.getMarks())
                .build();
    }

    public static List<Marks> toDtoList(List<MarksEntity> marksEntityList) {
        return marksEntityList.stream().map(MarksTransformer::toDto).collect(Collectors.toList());
    }
}
