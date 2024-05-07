package com.project.studentmanagement.handling.entity;

import com.project.studentmanagement.handling.dto.Marks;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String address;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="studentId")
//    private List<Marks> marks;
}




