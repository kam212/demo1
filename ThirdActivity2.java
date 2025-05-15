package com.example.demo1;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class ThirdActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        // Declare the button
        Button previousButton = findViewById(R.id.previous_button);

        // ClickListener for button
        previousButton.setOnClickListener(v -> {
            // Intent back to SecondActivity or Checklist
            Intent intent = new Intent(ThirdActivity2.this, SecondActivity.class);

            startActivity(intent);
        });
    }
}