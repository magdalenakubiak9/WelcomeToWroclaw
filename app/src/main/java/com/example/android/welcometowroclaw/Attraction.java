package com.example.android.welcometowroclaw;

/**
 * {@link Attraction} represents an attraction that the user can see in the app.
 * It contains a name, a short description and a photo of the attraction
 */

public class Attraction {

    /** Attraction's name */
    private int mAttractionNameResourceId;

    /** Attraction's description */
    private int mAttractionDescriptionResourceId;

    /** Image resource ID for the photo of the attraction */
    private int mImageResourceId;


    /**
     * Create a new Attraction object.
     *
     * @param attractionNameResourceId is the name of the attraction
     * @param attractionDescriptionResourceId is a short description for a given attraction
     * @param imageResourceId is the drawable resource ID for the image of the attraction
     *
     */
    public Attraction(int attractionNameResourceId, int attractionDescriptionResourceId, int imageResourceId) {
        mAttractionNameResourceId = attractionNameResourceId;
        mAttractionDescriptionResourceId = attractionDescriptionResourceId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the attraction's name.
     */
    public int getAttractionNameResourceId() {
        return mAttractionNameResourceId;
    }

    /**
     * Get the attraction's description.
     */
    public int getAttractionDescriptionResourceId() {
        return mAttractionDescriptionResourceId;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
