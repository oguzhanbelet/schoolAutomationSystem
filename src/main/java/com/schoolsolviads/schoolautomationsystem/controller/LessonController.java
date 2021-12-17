package com.schoolsolviads.schoolautomationsystem.controller;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Lesson;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.LessonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping("/addLesson")
    public void addLesson(@RequestBody Lesson lesson){
        this.lessonService.addLesson(lesson);
    }

    @DeleteMapping("/deleteLesson")
    public void deleteLessonById(@RequestParam long id){
        this.lessonService.deleteLessonById(id);
    }
}
