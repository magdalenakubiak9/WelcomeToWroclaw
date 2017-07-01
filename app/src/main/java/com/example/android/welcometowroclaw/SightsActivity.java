package com.example.android.welcometowroclaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create a list of sights
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.sights_cathedral, R.string.sights_cathedral_description, R.drawable.sights_catherdal));
        attractions.add(new Attraction(R.string.sights_fountain, R.string.sights_fountain_description, R.drawable.sights_fountain));
        attractions.add(new Attraction(R.string.sights_japanese_garden, R.string.sights_japanese_garden_description, R.drawable.sights_japanese_garden));
        attractions.add(new Attraction(R.string.sights_market_square, R.string.sights_market_square_description, R.drawable.sights_market_square));
        attractions.add(new Attraction(R.string.sights_ostrow, R.string.sights_ostrow_description, R.drawable.sights_ostrow));
        attractions.add(new Attraction(R.string.sights_sky_tower, R.string.sights_sky_tower_description, R.drawable.sights_sky_tower));
        attractions.add(new Attraction(R.string.sights_town_hall, R.string.sights_town_hall_description, R.drawable.sights_town_hall));
        attractions.add(new Attraction(R.string.sights_zoo, R.string.sights_zoo_description, R.drawable.sights_zoo));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter}
        listView.setAdapter(adapter);
    }
}
