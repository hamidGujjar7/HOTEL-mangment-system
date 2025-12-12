package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Hotel;

import java.util.List;

@Dao
public interface HotelDao {
    @Insert
    void insert(Hotel hotel);

    @Update
    void update(Hotel hotel);

    @Delete
    void delete(Hotel hotel);

    @Query("SELECT * FROM Hotel")
    LiveData<List<Hotel>> getAllHotels();

    @Query("SELECT * FROM Hotel WHERE id = :id")
    LiveData<Hotel> getHotelById(int id);
}