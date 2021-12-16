package com.schoolsolviads.schoolautomationsystem.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private long id;
    private String studentName;
    private String studentLastName;
    private int studentNumber;
    private String className;
}
