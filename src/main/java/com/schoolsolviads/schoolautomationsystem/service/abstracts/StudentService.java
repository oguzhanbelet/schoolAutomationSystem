package com.schoolsolviads.schoolautomationsystem.service.abstracts;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Student;
import com.schoolsolviads.schoolautomationsystem.model.dto.StudentDto;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<StudentDto> getAllStudentsWithDetails();
    void deleteStudentById(long id);

}
