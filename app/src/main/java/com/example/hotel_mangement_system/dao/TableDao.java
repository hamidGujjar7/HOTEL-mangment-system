package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Table;

import java.util.List;

@Dao
public interface TableDao {
    @Insert
    void insert(Table table);

    @Update
    void update(Table table);

    @Delete
    void delete(Table table);

    @Query("SELECT * FROM `Table`")
    LiveData<List<Table>> getAllTables();

    @Query("SELECT * FROM `Table` WHERE id = :id")
    LiveData<Table> getTableById(int id);

    @Query("SELECT * FROM `Table` WHERE hotelId = :hotelId")
    LiveData<List<Table>> getTablesByHotel(int hotelId);

    @Query("SELECT * FROM `Table` WHERE hotelId = :hotelId AND status = :status")
    LiveData<List<Table>> getTablesByStatus(int hotelId, String status);
}