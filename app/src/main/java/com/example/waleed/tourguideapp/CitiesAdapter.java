package com.example.waleed.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Waleed on 07/04/17.
 */

public class CitiesAdapter extends FragmentPagerAdapter {
    Context mContext;
    private Event event;
    private HistoricalSite historicalSite;
    private CityInformation cityInformation;
    private Restaurant restaurant;
    public CitiesAdapter(FragmentManager fm , Context mContext) {
        super(fm);
        this.mContext = mContext;
        event = new Event();
        historicalSite = new HistoricalSite();
        cityInformation = new CityInformation();
        restaurant = new Restaurant();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return event;
            case 1:return historicalSite;
            case 2:return cityInformation;
            case 3:return restaurant;
            default:return event;
        }
    }

    public Event getEvent() {
        return event;
    }

    public HistoricalSite getHistoricalSite() {
        return historicalSite;
    }

    public CityInformation getCityInformation() {
        return cityInformation;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
