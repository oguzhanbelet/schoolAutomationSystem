package com.schoolsolviads.schoolautomationsystem.service.concretes;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Lesson;
import com.schoolsolviads.schoolautomationsystem.repository.LessonRepository;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.LessonService;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImp implements LessonService {

    private final LessonRepository lessonRepository;

    public LessonServiceImp(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public void addLesson(Lesson lesson) {
        this.lessonRepository.save(lesson);
    }

    @Override
    public void deleteLessonById(long id) {
        if (this.lessonRepository.existsById(id)){
            this.lessonRepository.deleteById(id);
        }else {
            throw new UnsupportedOperationException();
        }
    }
}
