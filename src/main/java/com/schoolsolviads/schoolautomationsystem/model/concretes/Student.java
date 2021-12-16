package com.schoolsolviads.schoolautomationsystem.model.concretes;



import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String studentName;

    private String studentLastname;

    private int studentNumber;

    @ManyToOne
    public ClassRoom classRoom;
}
