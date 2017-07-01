package com.example.android.welcometowroclaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView that shows sights
        TextView sights = (TextView) findViewById(R.id.sights);

        // Set on click listener on that TextView
        sights.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when "sights" is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SightsActivity}
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);

                // Start the new activity
                startActivity(sightsIntent);
            }
        });

        // Find the TextView that shows museums
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set on click listener on that TextView
        museums.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when "museums" is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumsActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the TextView that shows restaurants
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set on click listener on that TextView
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when "restaurants" is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the TextView that shows events
        TextView events = (TextView) findViewById(R.id.events);

        // Set on click listener on that TextView
        events.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when "events" is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsActivity}
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventsIntent);
            }
        });
    }
}
