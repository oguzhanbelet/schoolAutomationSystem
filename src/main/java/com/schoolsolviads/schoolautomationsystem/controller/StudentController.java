package com.schoolsolviads.schoolautomationsystem.controller;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Student;
import com.schoolsolviads.schoolautomationsystem.model.dto.StudentDto;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        this.studentService.addStudent(student);
    }

    @GetMapping("/getAllStudentsWithDetails")
    public List<StudentDto> getAllStudentsWithDetails(){
        return this.studentService.getAllStudentsWithDetails();
    }


    @DeleteMapping("/deleteStudentById")
    public void deleteStudentById(@RequestParam long id){
        this.studentService.deleteStudentById(id);
    }
}
