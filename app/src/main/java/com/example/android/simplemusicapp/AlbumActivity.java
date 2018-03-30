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

        ArrayList<Word> words = new ArrayList<>();
        // Create  a list of words
        words.add(new Word("House", "4", R.drawable.house));
        words.add(new Word("Minimal", "1", R.drawable.minimal));
        words.add(new Word("Dance", "1", R.drawable.dance));
        words.add(new Word("Techno", "2", R.drawable.hifi));
        words.add(new Word("Trance", "3", R.drawable.trance));

        // Create a WordAdapter
        WordAdapter adapter = new WordAdapter(this, words);
        // Set the listView
        ListView listView = findViewById(R.id.list);
        //  Set the adapter
        listView.setAdapter(adapter);

    }
}
