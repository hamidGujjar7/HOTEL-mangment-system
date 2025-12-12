package com.example.hotel_mangement_system.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Hotel {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String address;
    public String contact;
    public int floors;
    public int totalRooms;
    public String currency;
    public String timeZone;

    public Hotel() {}

    public Hotel(String name, String address, String contact, int floors, int totalRooms, String currency, String timeZone) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.floors = floors;
        this.totalRooms = totalRooms;
        this.currency = currency;
        this.timeZone = timeZone;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
    public int getFloors() { return floors; }
    public void setFloors(int floors) { this.floors = floors; }
    public int getTotalRooms() { return totalRooms; }
    public void setTotalRooms(int totalRooms) { this.totalRooms = totalRooms; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getTimeZone() { return timeZone; }
    public void setTimeZone(String timeZone) { this.timeZone = timeZone; }
}