package org.example;

public class Flat {

    private String address;
    private int numberRooms;
    private double floorArea;
    private double price;
    private String owner;
    private String contactNumber;

    public Flat(String address, int numberRooms, double floorArea, double price, String owner, String contactNumber) {
        this.address = address;
        this.numberRooms = numberRooms;
        this.floorArea = floorArea;
        this.price = price;
        this.owner = owner;
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public double getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
