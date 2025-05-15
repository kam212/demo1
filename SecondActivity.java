package com.example.demo1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity {

    private EditText editTextItem;

    private ArrayList<String> groceryList;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button buttonAdd = findViewById(R.id.buttonAdd);
        ListView shopList = findViewById(R.id.shoplist);

        groceryList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, groceryList);
        shopList.setAdapter(adapter);


        Button camButton = findViewById(R.id.cam_button);
        Button previousButton;
        previousButton = findViewById(R.id.prev_button);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                camButton.setOnClickListener(v -> {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity2.class);
                    // Start the activity
                    startActivity(intent);
                });
                // Add click listener for Home button
                previousButton.setOnClickListener(v -> {
                    // Intent to start FirstActivity
                    Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                    // Start the activity
                    startActivity(intent);
                });


                String item = editTextItem.getText().toString().trim();
                if (!item.isEmpty()) {
                    groceryList.add(item);
                    adapter.notifyDataSetChanged();
                    editTextItem.setText("");
                } else {
                    Toast.makeText(SecondActivity.this, "Please enter an item", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}