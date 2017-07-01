package com.example.android.welcometowroclaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create a list of sights
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.restaurants_bernard, R.string.restaurants_bernard_description, R.drawable.restaurants_bernard));
        attractions.add(new Attraction(R.string.restaurants_maddalena, R.string.restaurants_maddalena_description, R.drawable.restaurants_maddalena));
        attractions.add(new Attraction(R.string.restaurants_mama_manousch, R.string.restaurants_mama_manousch_description, R.drawable.restaurants_mama_manousch));
        attractions.add(new Attraction(R.string.restaurants_osiem_misek, R.string.restaurants_osiem_misek_description, R.drawable.restaurants_osiem_misek));
        attractions.add(new Attraction(R.string.restaurants_pasibus, R.string.restaurants_pasibus_description, R.drawable.restaurants_pasibus));
        attractions.add(new Attraction(R.string.restaurants_piec_naszewskiej, R.string.restaurants_piec_naszewskiej_description, R.drawable.restaurants_piec_naszewskiej));
        attractions.add(new Attraction(R.string.restaurants_stol, R.string.restaurants_stol_description, R.drawable.restaurants_stol));
        attractions.add(new Attraction(R.string.restaurants_whiskey, R.string.restaurants_whiskey_description, R.drawable.restaurants_whiskey));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter}
        listView.setAdapter(adapter);
    }
}