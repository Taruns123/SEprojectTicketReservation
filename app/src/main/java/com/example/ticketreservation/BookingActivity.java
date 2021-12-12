package com.example.ticketreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookingActivity extends AppCompatActivity {
    public void confirm(View view){
        Intent intent = new Intent(BookingActivity.this,SuccessActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
    }
}