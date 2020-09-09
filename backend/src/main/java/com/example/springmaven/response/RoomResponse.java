package com.example.springmaven.response;


public class RoomResponse {
    private String roomName;
    private String roomNumber;
    private String bedInfo;

    public RoomResponse(String roomName, String roomNumber, String bedInfo) {
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.bedInfo = bedInfo;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
