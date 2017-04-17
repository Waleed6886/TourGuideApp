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

public class HistoricalSite extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.historical_site,container,false);

        final ArrayList<Town> towns = new ArrayList<Town>();

        towns.add(new Town(R.string.h1, R.string.saudiArabia, R.drawable.h111 ));
        towns.add(new Town(R.string.h2, R.string.saudiArabia, R.drawable.h222 ));
        towns.add(new Town(R.string.h3, R.string.saudiArabia, R.drawable.h333 ));
        towns.add(new Town(R.string.h4, R.string.saudiArabia, R.drawable.h444 ));

        TownAdapter adapter = new TownAdapter (getActivity(), towns,R.drawable.card_red);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }

}
