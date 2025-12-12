package com.example.hotel_mangement_system.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.hotel_mangement_system.dao.HotelDao;
import com.example.hotel_mangement_system.db.AppDatabase;
import com.example.hotel_mangement_system.db.Hotel;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HotelRepository {
    private HotelDao hotelDao;
    private LiveData<List<Hotel>> allHotels;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public HotelRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        hotelDao = db.hotelDao();
        allHotels = hotelDao.getAllHotels();
    }

    public LiveData<List<Hotel>> getAllHotels() {
        return allHotels;
    }

    public LiveData<Hotel> getHotelById(int id) {
        return hotelDao.getHotelById(id);
    }

    public void insert(Hotel hotel) {
        executorService.execute(() -> hotelDao.insert(hotel));
    }

    public void update(Hotel hotel) {
        executorService.execute(() -> hotelDao.update(hotel));
    }

    public void delete(Hotel hotel) {
        executorService.execute(() -> hotelDao.delete(hotel));
    }
}