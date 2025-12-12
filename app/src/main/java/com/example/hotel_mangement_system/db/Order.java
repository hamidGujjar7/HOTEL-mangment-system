package com.example.hotel_mangement_system.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Order {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int tableId;
    public String items; // JSON string of dishes
    public double total;
    public String status; // Pending, Served, Paid
    public String timestamp;

    public Order() {}

    public Order(int tableId, String items, double total, String status, String timestamp) {
        this.tableId = tableId;
        this.items = items;
        this.total = total;
        this.status = status;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getTableId() { return tableId; }
    public void setTableId(int tableId) { this.tableId = tableId; }
    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}