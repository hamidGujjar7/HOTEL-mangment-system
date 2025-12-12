package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Room;

import java.util.List;

@Dao
public interface RoomDao {
    @Insert
    void insert(Room room);

    @Update
    void update(Room room);

    @Delete
    void delete(Room room);

    @Query("SELECT * FROM Room")
    LiveData<List<Room>> getAllRooms();

    @Query("SELECT * FROM Room WHERE id = :id")
    LiveData<Room> getRoomById(int id);

    @Query("SELECT * FROM Room WHERE hotelId = :hotelId")
    LiveData<List<Room>> getRoomsByHotel(int hotelId);

    @Query("SELECT * FROM Room WHERE hotelId = :hotelId AND status = :status")
    LiveData<List<Room>> getRoomsByStatus(int hotelId, String status);
}