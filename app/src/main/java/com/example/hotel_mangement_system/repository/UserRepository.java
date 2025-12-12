package com.example.hotel_mangement_system.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.hotel_mangement_system.dao.UserDao;
import com.example.hotel_mangement_system.db.AppDatabase;
import com.example.hotel_mangement_system.db.User;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserRepository {
    private UserDao userDao;
    private LiveData<List<User>> allUsers;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public UserRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        userDao = db.userDao();
        allUsers = userDao.getAllUsers();
    }

    public LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    public LiveData<User> login(String username, String password) {
        return userDao.login(username, password);
    }

    public void insert(User user) {
        executorService.execute(() -> userDao.insert(user));
    }

    public void update(User user) {
        executorService.execute(() -> userDao.update(user));
    }

    public void delete(User user) {
        executorService.execute(() -> userDao.delete(user));
    }
}