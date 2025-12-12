package com.example.hotel_mangement_system.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int hotelId;
    public String name;
    public String description;
    public String ingredients; // optional
    public double price;
    public String category; // Appetizers, Main Course, etc.
    public boolean available;

    public Dish() {}

    public Dish(int hotelId, String name, String description, String ingredients, double price, String category, boolean available) {
        this.hotelId = hotelId;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}