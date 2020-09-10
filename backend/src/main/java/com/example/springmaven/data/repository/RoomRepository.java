package com.example.springmaven.data.repository;

import com.example.springmaven.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findRoomByRoomNumber (@Param("roomNumber")String roomNumber);
    List<Room> findRoomByRoomName (@Param("roomName")String roomName);
}
