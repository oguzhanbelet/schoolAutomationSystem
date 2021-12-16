package com.schoolsolviads.schoolautomationsystem.service.concretes;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Teacher;
import com.schoolsolviads.schoolautomationsystem.model.dto.TeacherDto;
import com.schoolsolviads.schoolautomationsystem.repository.TeacherRepository;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImp implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImp(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        this.teacherRepository.save(teacher);
    }

    @Override
    public List<TeacherDto> getAllTeachersWithDetails() {
        return this.teacherRepository.gettAllTeachersWithDetails();
    }

    @Override
    public void deleteTeacherById(long id) {
        if (this.teacherRepository.existsById(id)){
            this.teacherRepository.deleteById(id);
        }
        else {
            throw new UnsupportedOperationException();
        }

    }
}
