package com.example.android.simplemusicapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Xan on 2018. 03. 26..
 */

public class AlbumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the list_word.xml layout file
        setContentView(R.layout.list_word);

        ArrayList<Music> music = new ArrayList<>();
        // Create  a list of music
        music.add(new Music("House", "4", R.drawable.house));
        music.add(new Music("Minimal", "1", R.drawable.minimal));
        music.add(new Music("Dance", "1", R.drawable.dance));
        music.add(new Music("Techno", "2", R.drawable.hifi));
        music.add(new Music("Trance", "3", R.drawable.trance));

        // Create a MusicAdapter
        MusicAdapter adapter = new MusicAdapter(this, music);
        // Set the listView
        ListView listView = findViewById(R.id.list);
        //  Set the adapter
        listView.setAdapter(adapter);

    }
}
