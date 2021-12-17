package com.schoolsolviads.schoolautomationsystem.service.abstracts;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Lesson;

public interface LessonService {
    void addLesson(Lesson lesson);
    void deleteLessonById(long id);
}
