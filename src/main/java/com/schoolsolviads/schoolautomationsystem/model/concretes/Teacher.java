package com.schoolsolviads.schoolautomationsystem.model.concretes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String teacherName;

    private String teacherLastName;

    private int birthYear;

    @ManyToOne
    public Lesson lesson;
}
