package com.example.android.simplemusicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Xan on 2018. 03. 26..
 */


public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, ArrayList<Music> music) {
        // Initialize the MusicAdapter's internal storage
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link Music} object located at this position in the list
        Music currentMusic = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID type
        TextView nameMiwok = listItemView.findViewById(R.id.type);
        nameMiwok.setText(currentMusic.getmType());

        // Find the TextView in the list_item.xml layout with the ID artist
        TextView nameDefault = listItemView.findViewById(R.id.artist);
        nameDefault.setText(currentMusic.getmArtist());

        // Find the TextView in the list_item.xml layout with the ID cover
        ImageView nameCover = listItemView.findViewById(R.id.cover);
        nameCover.setImageResource(currentMusic.getmCover());

        return listItemView;
    }
}
