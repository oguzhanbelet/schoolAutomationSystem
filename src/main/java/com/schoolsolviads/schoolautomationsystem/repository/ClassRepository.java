package com.schoolsolviads.schoolautomationsystem.repository;

import com.schoolsolviads.schoolautomationsystem.model.concretes.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassRoom, Long> {

}
