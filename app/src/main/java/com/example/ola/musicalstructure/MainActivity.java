package com.example.ola.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the pop music category
        Button pop = (Button) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the pop music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopMusicActivity}
                Intent popIntent = new Intent(MainActivity.this, PopMusic.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the rock music category
        Button rock = (Button) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockMusicActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockMusic.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the film music category
        Button film = (Button) findViewById(R.id.film);

        // Set a click listener on that View
        film.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the film music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FilmMusicActivity}
                Intent filmIntent = new Intent(MainActivity.this, FilmMusic.class);

                // Start the new activity
                startActivity(filmIntent);
            }
        });

        // Find the View that shows the hip hop music category
        Button hiphop = (Button) findViewById(R.id.hiphop);

        // Set a click listener on that View
        hiphop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the hip hop music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopMusic.class);

                // Start the new activity
                startActivity(hiphopIntent);
            }
        });

    }

}
