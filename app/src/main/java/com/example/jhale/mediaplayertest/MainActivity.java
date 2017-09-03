package com.example.jhale.mediaplayertest;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView playAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playAudio = (TextView)findViewById(R.id.play_audio);
        playAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio.setText("Playing audio!");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.ting);
                mediaPlayer.start();
            }
        });
    }
}
