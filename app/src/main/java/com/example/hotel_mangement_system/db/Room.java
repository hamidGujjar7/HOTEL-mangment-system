package com.example.hotel_mangement_system.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Room {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int hotelId;
    public String type;
    public double price;
    public int capacity;
    public String status; // Available, Occupied, Under Maintenance, Reserved
    public int floor;
    public String number;
    public String amenities; // comma separated

    public Room() {}

    public Room(int hotelId, String type, double price, int capacity, String status, int floor, String number, String amenities) {
        this.hotelId = hotelId;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
        this.status = status;
        this.floor = floor;
        this.number = number;
        this.amenities = amenities;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getFloor() { return floor; }
    public void setFloor(int floor) { this.floor = floor; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getAmenities() { return amenities; }
    public void setAmenities(String amenities) { this.amenities = amenities; }
}