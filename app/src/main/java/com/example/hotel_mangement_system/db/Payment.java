package com.example.hotel_mangement_system.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Payment {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int hotelId;
    public String method; // Cash, Credit Card, Online Transfer, Room Charge
    public double amount;
    public String date;
    public String time;
    public String associated; // e.g., "Room 101" or "Table 5"
    public String transactionId; // optional

    public Payment() {}

    public Payment(int hotelId, String method, double amount, String date, String time, String associated, String transactionId) {
        this.hotelId = hotelId;
        this.method = method;
        this.amount = amount;
        this.date = date;
        this.time = time;
        this.associated = associated;
        this.transactionId = transactionId;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getAssociated() { return associated; }
    public void setAssociated(String associated) { this.associated = associated; }
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
}