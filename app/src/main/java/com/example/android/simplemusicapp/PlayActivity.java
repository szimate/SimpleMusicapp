package com.example.android.simplemusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Xan on 2018. 03. 27..
 */

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Find the Button that play the music
        ImageButton play = findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the Button to the previous music
        ImageButton back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the previous button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Previous", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the Button to the next music
        ImageButton next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the next button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Next", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the Button to shuffle the music
        ImageButton shuffle = findViewById(R.id.shuffle);

        shuffle.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shuffle button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Shuffle", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the Button to like the music
        ImageButton like = findViewById(R.id.like);

        like.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the like button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Add to favorite", Toast.LENGTH_SHORT).show();
            }
        });


        // Find the TextView that move to main_menu.xml
        TextView main = findViewById(R.id.main_menu);

        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Main button is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(PlayActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }

        });

    }
}
