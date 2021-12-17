package com.schoolsolviads.schoolautomationsystem.repository;

import com.schoolsolviads.schoolautomationsystem.model.concretes.Student;
import com.schoolsolviads.schoolautomationsystem.model.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select new com.schoolsolviads.schoolautomationsystem.model.dto.StudentDto" +
            "(s.id, s.studentName, s.studentLastname, s.studentNumber, c.className)" +
            " from Student s" +
            " inner join s.classRoom c")
    List<StudentDto> getAllStudentsWithDetails();

    @Modifying
    @Query("update Student s set s.studentName = ?1 where s.id = ?2")
    void updateStudentNameById(String name, long id);
}
