package com.example.android.musicapp;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.android.musicapp.songList.coldplayboolean;
import static com.example.android.musicapp.songList.edboolean;
import static com.example.android.musicapp.songList.lostyouboolean;
import static com.example.android.musicapp.songList.theoneboolean;
import static com.example.android.musicapp.songList.unforgettableboolean;


public class MusicPlayer extends AppCompatActivity {
    public TextView title;
    public ImageView image;
    public TextView infoText2;
    final Context c2 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        title = (TextView) findViewById(R.id.songName);
        image = (ImageView) findViewById(R.id.imagePlayer);
        image.setImageResource(R.drawable.theone);

        if (coldplayboolean) {
            title.setText(R.string.coldplay);
            image.setImageResource(R.drawable.chainsmokerscoldplay);
        }
        if (theoneboolean) {
            title.setText(R.string.theOne);
            image.setImageResource(R.drawable.theone);
        }

        if (edboolean) {
            title.setText(R.string.edShreeran);
            image.setImageResource(R.drawable.shapeof);
        }

        if (unforgettableboolean) {
            title.setText(R.string.unforgettable);
            image.setImageResource(R.drawable.unforgettable);
        }

        if (lostyouboolean) {
            title.setText(R.string.lostYou);
            image.setImageResource(R.drawable.lostyou);
        }

        if (!theoneboolean && !edboolean && !lostyouboolean && !unforgettableboolean && !coldplayboolean) {
            lostyouboolean = true;
        }

        TextView Home2 = (TextView) findViewById(R.id.homeButton);
        Home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MusicPlayer.this, MainActivity.class);
                startActivity(homeIntent);
            }

        });

        TextView songList = (TextView) findViewById(R.id.songlistButton);
        songList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MusicPlayer.this, songList.class);
                startActivity(listIntent);
            }

        });


        infoText2 = (TextView) findViewById(R.id.info2);
        infoText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c2);
                View mView = layoutInflaterAndroid.inflate(R.layout.info_activity, null);
                TextView TextInfo = (TextView) mView.findViewById(R.id.allertMessage);
                TextInfo.setText(R.string.musicActivity);
                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c2);
                alertDialogBuilderUserInput.setView(mView);
                alertDialogBuilderUserInput
                        .setCancelable(true);
                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                alertDialogAndroid.show();

            }
        });
    }


}
