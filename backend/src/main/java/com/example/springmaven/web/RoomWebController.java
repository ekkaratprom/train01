package com.example.springmaven.web;

import com.example.springmaven.data.entity.Room;
import com.example.springmaven.data.repository.RoomRepository;
import com.example.springmaven.response.RoomResponse;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


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
//        verifyRoomNumber(roomNumber);
        return roomRepository.findRoomByRoomNumber(roomNumber);
    }

//    private Room verifyRoomNumber(String roomNumber) throws NoSuchElementException {
//        return roomRepository.findRoomByRoomNumber(roomNumber).orElseThrow(() ->
//                new NoSuchElementException("Tour does not exist " + roomNumber));
//    }
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(NoSuchElementException.class)
//    public String return400(NoSuchElementException ex) {
//        return ex.getMessage();
//    }

}