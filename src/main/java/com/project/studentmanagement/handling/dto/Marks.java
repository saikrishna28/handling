package com.project.studentmanagement.handling.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Marks {
    private Integer id;
    private String studentId;
    private String subject;
    private Float marks;
    private String grade;
}
