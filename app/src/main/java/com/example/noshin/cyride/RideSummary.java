package com.example.noshin.cyride;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class RideSummary extends AppCompatActivity {

    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_summary);

        chronometer = findViewById(R.id.chronometer);
        chronometer.setText(getIntent().getStringExtra("duration"));
    }
}
