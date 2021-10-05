package com.example.quakeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList earthquakes = new ArrayList<Quake>();
        earthquakes.add(new Quake(8.4, "San Francisco", "7th July"));
        earthquakes.add(new Quake(7.4, "London", "4th August"));
        earthquakes.add(new Quake(8.5, "Tokyo", "18th June"));
        earthquakes.add(new Quake(4.5, "Mexico City", "4th Jan"));
        earthquakes.add(new Quake(5.0, "Moscow","13th December"));
        earthquakes.add(new Quake(7.9, "Rio de Janeiro", "8 September"));
        earthquakes.add(new Quake(3.3, "Paris", "13th October"));
        QuakeAdapter adapter = new QuakeAdapter(this, earthquakes);
        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes

        earthquakeListView.setAdapter(adapter);
    }
}