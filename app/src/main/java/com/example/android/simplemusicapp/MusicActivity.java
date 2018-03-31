package com.example.android.simplemusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Xan on 2018. 03. 26..
 */

public class MusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the list_word.xml layout file
        setContentView(R.layout.list_word);

        final ArrayList<Music> music = new ArrayList<>();
        // Create  a list of music
        music.add(new Music("Open Your Eyes", "Carl Cox", R.drawable.hifi));
        music.add(new Music("Serenity", "Armin van Buuren", R.drawable.hifi));
        music.add(new Music("B3X", "Len Faki", R.drawable.hifi));
        music.add(new Music("I Go Out", "Debora De Lucha", R.drawable.hifi));
        music.add(new Music("Harder Better Faster Stronger", "Draft Punk", R.drawable.hifi));
        music.add(new Music("Traffic", "Tiesto", R.drawable.hifi));
        music.add(new Music("Dance I said", "Eric Morillo", R.drawable.hifi));
        music.add(new Music("On my way", "Tiesto", R.drawable.hifi));
        music.add(new Music("Right here, Right now", "Fat Boy Slim", R.drawable.hifi));
        music.add(new Music("Extasy", "ATB", R.drawable.hifi));

        // Create a MusicAdapter
        MusicAdapter adapter = new MusicAdapter(this, music);
        // Set the listView
        ListView listView = findViewById(R.id.list);
        //  Set the adapter
        listView.setAdapter(adapter);
        //Set the list item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent detailsIntent = new Intent(MusicActivity.this, PlayActivity.class);
                // Start the new activity
                startActivity(detailsIntent);
            }
        });
    }
}