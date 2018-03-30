package com.example.android.simplemusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the music category
        TextView music = findViewById(R.id.music);

        // Set a click listener on that View
        music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);

                // Start the new activity
                startActivity(musicIntent);

            }

        });


        // Find the View that shows the albums category
        TextView album = findViewById(R.id.albums);

        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the album category is clicked on.
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the favorite category
        TextView favorite = findViewById(R.id.favorite);

        favorite.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorite category is clicked on.
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the favorite category is clicked on.
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);

                // Start the new activity
                startActivity(favoriteIntent);
            }
        });

    }
}
