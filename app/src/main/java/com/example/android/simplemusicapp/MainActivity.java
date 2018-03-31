package com.example.android.simplemusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the music category
        TextView music = findViewById(R.id.music);
        // Set a click listener on that View
        music.setOnClickListener(this);

        // Find the View that shows the albums category
        TextView albums = findViewById(R.id.albums);
        // Set a click listener on that View
        albums.setOnClickListener(this);

        // Find the View that shows the favorite category
        TextView favorite = findViewById(R.id.favorite);
        // Set a click listener on that View
        favorite.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            // The code in this method will be executed when the music category is clicked on.
            case R.id.music:
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                // Start the new activity
                startActivity(musicIntent);
                break;

            // The code in this method will be executed when the album category is clicked on.
            case R.id.albums:
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                // Start the new activity
                startActivity(albumIntent);
                break;

            // The code in this method will be executed when the favorite category is clicked on.
            case R.id.favorite:
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                // Start the new activity
                startActivity(favoriteIntent);
                break;
        }
    }
}
