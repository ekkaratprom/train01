package com.example.springmaven.web;

import com.example.springmaven.data.entity.Room;
import com.example.springmaven.data.repository.RoomRepository;
import com.example.springmaven.response.RoomResponse;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class RoomWebController {
    @Autowired
    private RoomRepository roomRepository;

    @CrossOrigin
    @GetMapping("/v1/room")
    public List<RoomResponse> getAllRooms() {
        List<RoomResponse> roomResponsesList = new ArrayList<>();
        Iterable<Room> rooms = roomRepository.findAll();
        for (Room room : rooms) {
            roomResponsesList.add(
                    new RoomResponse(
                            room.getRoomName(),
                            room.getRoomNumber(),
                            room.getBedInfo()
                    )
            );
        }
            return roomResponsesList;
    }

    @CrossOrigin
    @GetMapping("/v1/room/{roomNumber}")
    public List<Room> getRoomByRoomNumber(@PathVariable(value =  "roomNumber") String roomNumber){
        return roomRepository.findRoomByRoomNumber(roomNumber);
    }

}