package com.example.waleed.tourguideapp;

/**
 * Created by Waleed on 14/04/17.
 */

public class Town {
    private int mCountryNameId;
    private int mTownNameId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Town(int townNameId, int countryNameId, int imageResourceId) {

        mCountryNameId = countryNameId;
        mTownNameId = townNameId;
        mImageResourceId = imageResourceId;
    }

    public Town(int townNameId, int countryNameId) {
        mCountryNameId = countryNameId;
        mTownNameId = townNameId;
    }

    public int getmCountryNameId() {
        return mCountryNameId;
    }

    public int getmTownNameId() {
        return mTownNameId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
