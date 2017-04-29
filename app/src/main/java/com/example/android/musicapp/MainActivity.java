package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is my code for opening song list by clicking textview

        TextView songList = (TextView) findViewById(R.id.mainButton2);

        songList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, songList.class);
                startActivity(songListIntent);
            }
        });

        //this is my code for opening music player by clicking textview

        TextView musicPlayer = (TextView) findViewById(R.id.mainButton1);

        musicPlayer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent musicIntent = new Intent(MainActivity.this, MusicPlayer.class);
                startActivity(musicIntent);
            }
        });

        //this is my code for opening track song by clicking textview

        TextView trackSong = (TextView) findViewById(R.id.mainButton3);

        trackSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent trackSongIntent = new Intent(MainActivity.this, TrackTheSong.class);
                startActivity(trackSongIntent);
            }
        });
    }
}
