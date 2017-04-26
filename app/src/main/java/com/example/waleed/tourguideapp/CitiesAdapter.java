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
    private EventFragment eventFragment;
    private HistoricalSiteFragment historicalSiteFragment;
    private CityInformationFragment cityInformationFragment;
    private RestaurantFragment restaurantFragment;

    public CitiesAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
        eventFragment = new EventFragment();
        historicalSiteFragment = new HistoricalSiteFragment();
        cityInformationFragment = new CityInformationFragment();
        restaurantFragment = new RestaurantFragment();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return eventFragment;
            case 1:
                return historicalSiteFragment;
            case 2:
                return cityInformationFragment;
            case 3:
                return restaurantFragment;
            default:
                return eventFragment;
        }
    }

    public EventFragment getEventFragment() {
        return eventFragment;
    }

    public HistoricalSiteFragment getHistoricalSiteFragment() {
        return historicalSiteFragment;
    }

    public CityInformationFragment getCityInformationFragment() {
        return cityInformationFragment;
    }

    public RestaurantFragment getRestaurantFragment() {
        return restaurantFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
