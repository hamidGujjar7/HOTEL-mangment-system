package com.example.hotel_mangement_system.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.hotel_mangement_system.db.User;
import com.example.hotel_mangement_system.repository.UserRepository;

public class LoginViewModel extends AndroidViewModel {

    private UserRepository userRepository;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application);
    }

    public LiveData<User> login(String username, String password) {
        return userRepository.login(username, password);
    }
}