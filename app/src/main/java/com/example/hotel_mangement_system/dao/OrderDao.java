package com.example.hotel_mangement_system.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hotel_mangement_system.db.Order;

import java.util.List;

@Dao
public interface OrderDao {
    @Insert
    void insert(Order order);

    @Update
    void update(Order order);

    @Delete
    void delete(Order order);

    @Query("SELECT * FROM `Order`")
    LiveData<List<Order>> getAllOrders();

    @Query("SELECT * FROM `Order` WHERE id = :id")
    LiveData<Order> getOrderById(int id);

    @Query("SELECT * FROM `Order` WHERE tableId = :tableId")
    LiveData<List<Order>> getOrdersByTable(int tableId);
}