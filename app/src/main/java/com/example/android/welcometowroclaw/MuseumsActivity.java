package com.example.android.welcometowroclaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create a list of sights
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.museums_architecture, R.string.museums_architecture_description, R.drawable.museums_architecture));
        attractions.add(new Attraction(R.string.museums_city_museum, R.string.museums_city_museum_description, R.drawable.museums_city_museum));
        attractions.add(new Attraction(R.string.museums_humanitarium, R.string.museums_humanitarium_description, R.drawable.museums_humanitarium));
        attractions.add(new Attraction(R.string.museums_hydropolis, R.string.museums_hydropolis_description, R.drawable.museums_hydropolis));
        attractions.add(new Attraction(R.string.museums_national_museum, R.string.museums_national_museum_description, R.drawable.museums_national_museum));
        attractions.add(new Attraction(R.string.museums_panorama, R.string.museums_panorama_description, R.drawable.museums_panorama));
        attractions.add(new Attraction(R.string.museums_topacz, R.string.museums_topacz_description, R.drawable.museums_topacz));
        attractions.add(new Attraction(R.string.museums_university, R.string.museums_university_description, R.drawable.museums_university));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter}
        listView.setAdapter(adapter);
    }
}