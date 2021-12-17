package com.schoolsolviads.schoolautomationsystem.service.concretes;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Student;
import com.schoolsolviads.schoolautomationsystem.model.dto.StudentDto;
import com.schoolsolviads.schoolautomationsystem.repository.StudentRepository;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;


    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void deleteStudentById(long id){
        this.studentRepository.deleteById(id);
    }

    @Override
    public void updateStudentNameById(String name, long id) {
        this.studentRepository.updateStudentNameById(name, id);
    }


    @Override
    public void addStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<StudentDto> getAllStudentsWithDetails() {
        return this.studentRepository.getAllStudentsWithDetails();
    }

}
