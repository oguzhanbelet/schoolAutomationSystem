package com.schoolsolviads.schoolautomationsystem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {
    private long id;
    private String teacherName;
    private String teacherLastName;
    private int birthYear;
    private String lessonName;
}
