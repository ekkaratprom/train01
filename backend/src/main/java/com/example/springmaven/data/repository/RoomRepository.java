package com.example.springmaven.data.repository;

import com.example.springmaven.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findRoomByRoomNumber (String roomNumber);
    List<Room> findRoomByRoomName (String roomName);
}
