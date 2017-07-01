package com.example.android.welcometowroclaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create a list of sights
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.events_bazaar, R.string.events_bazaar_description, R.drawable.events_bazaar));
        attractions.add(new Attraction(R.string.events_brave_festival, R.string.events_brave_festival_description, R.drawable.events_brave_festival));
        attractions.add(new Attraction(R.string.events_capitol, R.string.events_capitol_description, R.drawable.events_capitol));
        attractions.add(new Attraction(R.string.events_jazztopad, R.string.events_jazztopad_description, R.drawable.events_jazztopad));
        attractions.add(new Attraction(R.string.events_new_horizons, R.string.events_new_horizons_description, R.drawable.events_new_horizons));
        attractions.add(new Attraction(R.string.events_wratislavia_cantans, R.string.events_wratislavia_cantans_description, R.drawable.events_wratislavia_cantans));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter}
        listView.setAdapter(adapter);
    }
}