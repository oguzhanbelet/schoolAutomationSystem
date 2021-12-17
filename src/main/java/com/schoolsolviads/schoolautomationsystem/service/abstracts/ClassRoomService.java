package com.schoolsolviads.schoolautomationsystem.service.abstracts;

import com.schoolsolviads.schoolautomationsystem.model.concretes.ClassRoom;

public interface ClassRoomService {
    void addClassRoom(ClassRoom classRoom);
    void deleteClassRoomById(long id);
}
