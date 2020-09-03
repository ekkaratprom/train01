package com.example.springmaven.web;

import com.example.springmaven.data.entity.Room;
import com.example.springmaven.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class RoomWebController {
    @Autowired
    private RoomRepository roomRepository;

    @CrossOrigin
    @GetMapping("/v1/room")
    @ResponseBody
    public Iterable<Room> getRooms(){
        return this.roomRepository.findAll();
    }

}
