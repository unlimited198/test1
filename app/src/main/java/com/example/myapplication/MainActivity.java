package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gan();
    }

    private void gan() {
        txt1 = findViewById(R.id.txt1);
        txt1 = findViewById(R.id.txt1);
        txt1 = findViewById(R.id.txt1);
        txt1 = findViewById(R.id.txt1);
    }
}