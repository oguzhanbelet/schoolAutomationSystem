package com.schoolsolviads.schoolautomationsystem.controller;

import com.schoolsolviads.schoolautomationsystem.model.concretes.ClassRoom;
import com.schoolsolviads.schoolautomationsystem.service.abstracts.ClassRoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clasrooms")
public class ClasRoomController {
    private final ClassRoomService classRoomService;

    public ClasRoomController(ClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }

    @PostMapping("/addClassRoom")
    public void addClassRoom(@RequestBody ClassRoom classRoom){
        this.classRoomService.addClassRoom(classRoom);
    }

    @DeleteMapping("/deleteClassRoomById")
    public void deleteClassRoomById(@RequestParam long id){
        this.classRoomService.deleteClassRoomById(id);
    }

}
