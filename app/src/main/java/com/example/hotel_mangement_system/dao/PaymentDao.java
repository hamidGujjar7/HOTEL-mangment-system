package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Payment;

import java.util.List;

@Dao
public interface PaymentDao {
    @Insert
    void insert(Payment payment);

    @Update
    void update(Payment payment);

    @Delete
    void delete(Payment payment);

    @Query("SELECT * FROM Payment")
    LiveData<List<Payment>> getAllPayments();

    @Query("SELECT * FROM Payment WHERE id = :id")
    LiveData<Payment> getPaymentById(int id);

    @Query("SELECT * FROM Payment WHERE hotelId = :hotelId")
    LiveData<List<Payment>> getPaymentsByHotel(int hotelId);

    @Query("SELECT SUM(amount) FROM Payment WHERE hotelId = :hotelId AND date LIKE :datePattern")
    LiveData<Double> getTotalRevenue(int hotelId, String datePattern); // e.g., "2023-12-%"
}