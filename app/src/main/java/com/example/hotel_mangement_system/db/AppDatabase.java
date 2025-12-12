package com.example.hotel_mangement_system.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.hotel_mangement_system.dao.DishDao;
import com.example.hotel_mangement_system.dao.HotelDao;
import com.example.hotel_mangement_system.dao.OrderDao;
import com.example.hotel_mangement_system.dao.PaymentDao;
import com.example.hotel_mangement_system.dao.ReservationDao;
import com.example.hotel_mangement_system.dao.RoomDao;
import com.example.hotel_mangement_system.dao.TableDao;
import com.example.hotel_mangement_system.dao.UserDao;

@Database(entities = {Hotel.class, User.class, Room.class, Reservation.class, Table.class, Order.class, Dish.class, Payment.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract HotelDao hotelDao();
    public abstract UserDao userDao();
    public abstract RoomDao roomDao();
    public abstract ReservationDao reservationDao();
    public abstract TableDao tableDao();
    public abstract OrderDao orderDao();
    public abstract DishDao dishDao();
    public abstract PaymentDao paymentDao();

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "hotel_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}