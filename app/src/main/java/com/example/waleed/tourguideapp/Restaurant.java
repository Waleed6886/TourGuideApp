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

public class Restaurant extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.restaurant,container,false);

        final ArrayList<Town> towns = new ArrayList<Town>();

        towns.add(new Town(R.string.r1, R.string.saudiArabia, R.drawable.r111 ));
        towns.add(new Town(R.string.r2, R.string.saudiArabia, R.drawable.r222 ));
        towns.add(new Town(R.string.r3, R.string.saudiArabia, R.drawable.r333 ));
        towns.add(new Town(R.string.r4, R.string.saudiArabia, R.drawable.r444 ));

        TownAdapter adapter = new TownAdapter (getActivity(), towns,R.drawable.card_yellow);
        ListView listView = (ListView) v.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return v;
    }
}
