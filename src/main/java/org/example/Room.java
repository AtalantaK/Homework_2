package org.example;

public class Room {
    private double roomSize;
    private String roomStatus;
    private String roomName;
    private int windowNumber;

    public Room(double roomSize, String roomStatus, String roomName, int windowNumber) {
        this.roomSize = roomSize;
        this.roomStatus = roomStatus;
        this.roomName = roomName;
        this.windowNumber = windowNumber;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getWindowNumber() {
        return windowNumber;
    }
}
