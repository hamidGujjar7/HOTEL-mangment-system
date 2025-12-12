package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Dish;

import java.util.List;

@Dao
public interface DishDao {
    @Insert
    void insert(Dish dish);

    @Update
    void update(Dish dish);

    @Delete
    void delete(Dish dish);

    @Query("SELECT * FROM Dish")
    LiveData<List<Dish>> getAllDishes();

    @Query("SELECT * FROM Dish WHERE id = :id")
    LiveData<Dish> getDishById(int id);

    @Query("SELECT * FROM Dish WHERE hotelId = :hotelId")
    LiveData<List<Dish>> getDishesByHotel(int hotelId);

    @Query("SELECT * FROM Dish WHERE hotelId = :hotelId AND category = :category")
    LiveData<List<Dish>> getDishesByCategory(int hotelId, String category);

    @Query("SELECT * FROM Dish WHERE hotelId = :hotelId AND available = 1")
    LiveData<List<Dish>> getAvailableDishes(int hotelId);
}