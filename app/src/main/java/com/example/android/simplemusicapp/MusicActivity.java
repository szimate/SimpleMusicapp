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

        final ArrayList<Word> words = new ArrayList<>();
        // Create  a list of words
        words.add(new Word("Open Your Eyes", "Carl Cox", R.drawable.hifi));
        words.add(new Word("Serenity", "Armin van Buuren", R.drawable.hifi));
        words.add(new Word("B3X", "Len Faki", R.drawable.hifi));
        words.add(new Word("I Go Out", "Debora De Lucha", R.drawable.hifi));
        words.add(new Word("Harder Better Faster Stronger", "Draft Punk", R.drawable.hifi));
        words.add(new Word("Traffic", "Tiesto", R.drawable.hifi));
        words.add(new Word("Dance I said", "Eric Morillo", R.drawable.hifi));
        words.add(new Word("On my way", "Tiesto", R.drawable.hifi));
        words.add(new Word("Right here, Right now", "Fat Boy Slim", R.drawable.hifi));
        words.add(new Word("Extasy", "ATB", R.drawable.hifi));

        // Create a WordAdapter
        WordAdapter adapter = new WordAdapter(this, words);
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