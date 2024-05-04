package com.project.studentmanagement.handling.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String address;
}
