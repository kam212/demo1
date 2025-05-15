package com.example.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize button using findViewById
        // Declare Button object
        Button nextActivityButton = findViewById(R.id.button);

        // Set click listener for the button
        nextActivityButton.setOnClickListener(v -> {
            // Create Intent to start SecondActivity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            // Start the activity
            startActivity(intent);
        });
    }
}


