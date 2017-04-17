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

public class Event extends Fragment {

   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.event,container,false);

       final ArrayList<Town> towns = new ArrayList<Town>();

       towns.add(new Town(R.string.e1, R.string.e11, R.drawable.e111 ));
       towns.add(new Town(R.string.e2, R.string.e22, R.drawable.e222 ));
       towns.add(new Town(R.string.e3, R.string.e33, R.drawable.e333 ));
       towns.add(new Town(R.string.e4, R.string.e44, R.drawable.e444 ));

       TownAdapter adapter = new TownAdapter (getActivity(), towns,R.drawable.card_blue);
       ListView listView = (ListView) view.findViewById(R.id.list);
       listView.setAdapter(adapter);

       return view;
   }
}
