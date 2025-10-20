package com.pluralsight;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double costOfRoom;


    public Room(int roomNumber, String roomType, boolean isAvailable, double costOfRoom) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.costOfRoom = costOfRoom;
    }

    public double getCostOfRoom() {
        return costOfRoom;
    }

    public void setCostOfRoom(double costOfRoom) {
        this.costOfRoom = costOfRoom;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", isAvailable=" + isAvailable +
                ", costOfRoom=" + costOfRoom +
                '}';
    }

    public void markAsOccupied(){
        isAvailable = false;
    }
    public void markAsAvailable(){
        isAvailable = true;
    }

}
