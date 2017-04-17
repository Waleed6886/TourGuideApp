package com.example.waleed.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Waleed on 07/04/17.
 */

public class CityInformation extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cityinfo,container,false);

        final ArrayList<Town> towns = new ArrayList<Town>();


        towns.add(new Town(R.string.i1, R.string.i11,R.drawable.i111));
        towns.add(new Town(R.string.i2, R.string.i22,R.drawable.i222));

        TownAdapter adapter = new TownAdapter (getActivity(), towns,R.drawable.card_green);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
