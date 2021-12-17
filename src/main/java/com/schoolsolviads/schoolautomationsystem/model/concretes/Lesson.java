package com.schoolsolviads.schoolautomationsystem.model.concretes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String lessonName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lessonStartTime;

    @OneToMany(mappedBy = "lesson")
    public Collection<Teacher> teachers;
}
