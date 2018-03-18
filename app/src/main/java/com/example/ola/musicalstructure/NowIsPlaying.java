package com.example.ola.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class NowIsPlaying extends AppCompatActivity {

    Button submitButton;
    SeekBar simpleSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_is_playing);

        // Using intent for launching main activity
        Button switchButton = (Button) findViewById(R.id.home_button);

        switchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowIsPlaying.this, MainActivity.class);
                startActivity(intent);
            }

        });

        // Initiate views
        simpleSeekBar =(SeekBar)findViewById(R.id.simpleSeekBar);

        // Perform seek bar change listener event used for getting the progress value
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(NowIsPlaying.this, "Seek bar progress is :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });



    }

}
