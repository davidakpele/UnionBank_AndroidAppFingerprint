package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Retrieve__Username extends AppCompatActivity {
    ImageView prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_username);
        prev =  findViewById(R.id.prev);
        prev.setOnClickListener(View->{
            Intent intent = new Intent(Retrieve__Username.this, MainActivity.class);
            startActivity(intent);
        });
    }
}