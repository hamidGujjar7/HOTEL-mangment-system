package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Reservation;

import java.util.List;

@Dao
public interface ReservationDao {
    @Insert
    void insert(Reservation reservation);

    @Update
    void update(Reservation reservation);

    @Delete
    void delete(Reservation reservation);

    @Query("SELECT * FROM Reservation")
    LiveData<List<Reservation>> getAllReservations();

    @Query("SELECT * FROM Reservation WHERE id = :id")
    LiveData<Reservation> getReservationById(int id);

    @Query("SELECT * FROM Reservation WHERE roomId = :roomId")
    LiveData<List<Reservation>> getReservationsByRoom(int roomId);
}