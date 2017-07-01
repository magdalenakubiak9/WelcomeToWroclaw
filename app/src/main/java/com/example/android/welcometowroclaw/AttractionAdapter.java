package com.example.android.welcometowroclaw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link AttractionAdapter} is an {@link ArrayAdapter} that  provides the layout for each attraction
 * based on a list of {@link Attraction} objects.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction>  {

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context is the current context
     * @param attractions is the list of {@link Attraction}s to be displayed.
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView resource ID in the list_item.xml layout with attraction's name
        TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the attraction's name from the current Attraction object and set this text on
        // the Attraction's name Text View.
        attractionNameTextView.setText(currentAttraction.getAttractionNameResourceId());

        // Find the TextView resource ID in the list_item.xml layout with the attraction's description
        TextView attractionDescriptionTextView = (TextView) listItemView.findViewById(R.id.attraction_description);
        // Get the dattraction's description from the currentAttraction object and set this text on
        // the attraction's description TextView.
        attractionDescriptionTextView.setText(currentAttraction.getAttractionDescriptionResourceId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        // Set the ImageView to the image resource assigned to the current Attraction
        imageView.setImageResource(currentAttraction.getImageResourceId());

        // Return the whole list item layout
        return listItemView;
    }
}
