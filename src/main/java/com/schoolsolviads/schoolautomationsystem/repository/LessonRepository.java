package com.schoolsolviads.schoolautomationsystem.repository;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
