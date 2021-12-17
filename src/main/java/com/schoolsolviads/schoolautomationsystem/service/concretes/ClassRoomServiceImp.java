package com.schoolsolviads.schoolautomationsystem.service.concretes;

import com.schoolsolviads.schoolautomationsystem.model.concretes.ClassRoom;
import com.schoolsolviads.schoolautomationsystem.repository.ClassRoomRepository;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.ClassRoomService;
import org.springframework.stereotype.Service;

@Service
public class ClassRoomServiceImp implements ClassRoomService {

    private final ClassRoomRepository classRoomRepository;

    public ClassRoomServiceImp(ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }

    @Override
    public void addClassRoom(ClassRoom classRoom) {
        this.classRoomRepository.save(classRoom);
    }

    @Override
    public void deleteClassRoomById(long id) {
        if (this.classRoomRepository.existsById(id)){
            this.classRoomRepository.deleteById(id);
        }else {
            throw new UnsupportedOperationException();
        }
    }
}
