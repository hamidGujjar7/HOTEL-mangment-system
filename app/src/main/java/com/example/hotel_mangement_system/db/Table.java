package com.example.hotel_mangement_system.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Table {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int hotelId;
    public String status; // Free, Occupied, Reserved
    public int capacity;
    public int x; // position for floor plan
    public int y;

    public Table() {}

    public Table(int hotelId, String status, int capacity, int x, int y) {
        this.hotelId = hotelId;
        this.status = status;
        this.capacity = capacity;
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
}