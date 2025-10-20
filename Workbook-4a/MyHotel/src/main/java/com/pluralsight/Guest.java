package com.pluralsight;

public class Guest {
    private String name;
    private int idNumber;
    private String email;
    private int roomNumber;
    private boolean isCheckedIn;
    private double bill;
//Constructor
    public Guest(String name, int idNumber,String email, int roomNumber,boolean isCheckedIn,double bill) {
        this.name = name;
        this.idNumber = idNumber;
        this.email = email;
        this.roomNumber = roomNumber;
        this.isCheckedIn = isCheckedIn;
        this.bill = bill;
    }
    //Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
//To string method
    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", email='" + email + '\'' +
                ", roomNumber=" + roomNumber +
                ", isCheckedIn=" + isCheckedIn +
                ", bill=" + bill +
                '}';
    }
    //Methods:
    public void checkIn() {
        isCheckedIn = true;
    }
    public void addCharge(double amount){
        bill += amount;
    }
    public void checkOut(){
        isCheckedIn = false;
    }

}
