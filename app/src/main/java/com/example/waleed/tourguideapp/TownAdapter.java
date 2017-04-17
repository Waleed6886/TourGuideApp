package com.example.waleed.tourguideapp;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Waleed on 14/04/17.
 */

public class TownAdapter extends ArrayAdapter<Town> {
    ArrayList<Town> townArrayList = new ArrayList<>();
    private int cardBackground;


    public TownAdapter (Context context, ArrayList object,int cardBackground){

       super (context, 0, object);
        townArrayList = object;
        this.cardBackground = cardBackground;

    }


    @Override
    public int getCount() {
        int count = townArrayList.size();
        return count;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        TextView textViewTown, textViewCountry = null;
        LinearLayout card;
        ImageView imageView;

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        v = inflater.inflate(R.layout.blue_print, parent,false);

        card = (LinearLayout) v.findViewById(R.id.card);
        card.setBackgroundResource(cardBackground);
        textViewTown = (TextView) v.findViewById(R.id.textViewTown);
        textViewCountry = (TextView) v.findViewById(R.id.textViewCountry);
        imageView = (ImageView) v.findViewById(R.id.imageList);


        textViewTown.setText(townArrayList.get(position).getmTownNameId());
        textViewCountry.setText(townArrayList.get(position).getmCountryNameId());
        imageView.setImageResource(townArrayList.get(position).getmImageResourceId());


        return v;
    }
}
