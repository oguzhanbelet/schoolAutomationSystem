package com.schoolsolviads.schoolautomationsystem.model.concretes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String lessonName;

    @OneToMany(mappedBy = "lesson")
    public Collection<Teacher> teachers;
}
