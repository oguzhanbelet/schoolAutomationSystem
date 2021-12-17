package com.schoolsolviads.schoolautomationsystem.repository;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Teacher;
import com.schoolsolviads.schoolautomationsystem.model.dto.TeacherDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("select new com.schoolsolviads.schoolautomationsystem.model.dto.TeacherDto" +
            "(t.id, t.teacherName, t.teacherLastName, t.birthYear, l.lessonName)" +
            " from Teacher t" +
            " inner join t.lesson l")
    List<TeacherDto> gettAllTeachersWithDetails();

    @Modifying
    @Query("update Teacher t set t.teacherName =? 1 where t.id =? 2")
    void updateTeacherNameById(String name, long id);
}
