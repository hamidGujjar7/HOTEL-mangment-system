package com.example.hotel_mangement_system;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private Button roomButton, tableButton, menuButton, paymentButton, reportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        roomButton = findViewById(R.id.room_management);
        tableButton = findViewById(R.id.table_management);
        menuButton = findViewById(R.id.menu_management);
        paymentButton = findViewById(R.id.payment_methods);
        reportButton = findViewById(R.id.reporting);

        roomButton.setOnClickListener(v -> startActivity(new Intent(this, RoomManagementActivity.class)));
        tableButton.setOnClickListener(v -> startActivity(new Intent(this, TableManagementActivity.class)));
        menuButton.setOnClickListener(v -> startActivity(new Intent(this, MenuManagementActivity.class)));
        paymentButton.setOnClickListener(v -> startActivity(new Intent(this, PaymentMethodsActivity.class)));
        reportButton.setOnClickListener(v -> startActivity(new Intent(this, ReportingActivity.class)));
    }
}