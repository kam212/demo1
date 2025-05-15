package com.example.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Initialize button using findViewById
        Button previousButton = findViewById(R.id.previous_button);

        // Set click listener for the button
        previousButton.setOnClickListener(v -> {
            // Intent to navigate back to SecondActivity
            Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
            // Start the activity
            startActivity(intent);
        });
    }
}



