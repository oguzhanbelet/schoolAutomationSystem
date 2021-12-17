package com.schoolsolviads.schoolautomationsystem.service.abstracts;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Teacher;
import com.schoolsolviads.schoolautomationsystem.model.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    void addTeacher(Teacher teacher);
    List<TeacherDto> getAllTeachersWithDetails();
    void deleteTeacherById(long id);
    void updateTeacherNameById(String name, long id);
}
