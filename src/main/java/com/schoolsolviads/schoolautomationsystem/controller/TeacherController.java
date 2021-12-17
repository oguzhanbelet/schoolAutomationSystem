package com.schoolsolviads.schoolautomationsystem.controller;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Teacher;
import com.schoolsolviads.schoolautomationsystem.model.dto.TeacherDto;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getAllTeachersWithDetails")
    public List<TeacherDto> getAllTeachersWithDetails(){
        return this.teacherService.getAllTeachersWithDetails();
    }

    @PostMapping("/addTeacher")
    public void addTeacher(@RequestBody Teacher teacher){
        this.teacherService.addTeacher(teacher);
    }

    @DeleteMapping("deleteTeacherById")
    public void deleteTeacherById(@RequestParam long id){
        this.teacherService.deleteTeacherById(id);
    }

    @PutMapping("/updateTeacherNameById")
    public int updateTeacherNameById(@RequestParam String name, @RequestParam long id){
        return this.teacherService.updateTeacherNameById(name,id);
    }
}
