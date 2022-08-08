package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Password__recovery extends AppCompatActivity {
    ImageView prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);
        prev =  findViewById(R.id.prev);
        prev.setOnClickListener(View->{
            Intent intent = new Intent(Password__recovery.this, MainActivity.class);
            startActivity(intent);
        });
    }
}